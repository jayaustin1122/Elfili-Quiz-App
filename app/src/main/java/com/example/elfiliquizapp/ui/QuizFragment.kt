package com.example.elfiliquizapp.ui
import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.elfiliquizapp.R
import com.example.elfiliquizapp.adapter.QuizAdapter
import com.example.elfiliquizapp.database.ElfiliDatabase
import com.example.elfiliquizapp.databinding.FragmentQuizBinding
import com.example.elfiliquizapp.table.QuizQuestion
import com.example.elfiliquizapp.database.UserPointsDao
import com.example.elfiliquizapp.table.UserPoints
import com.example.elfiliquizapp.viewmodels.HomeViewModel2
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class QuizFragment : Fragment() {
    private lateinit var binding: FragmentQuizBinding
    private lateinit var quizAdapter: QuizAdapter
    private var quizQuestions: List<QuizQuestion>? = null
    private lateinit var viewModel: HomeViewModel2
    // Database instance
    private lateinit var userPointsDao: UserPointsDao

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuizBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(HomeViewModel2::class.java)

        userPointsDao = ElfiliDatabase.invoke(requireContext()).getUserPointsDao()

        val quizQuestions = arguments?.getSerializable("quizQuestions") as? List<QuizQuestion>
        val taken = arguments?.getBoolean("taken") ?: false
        val position = arguments?.getString("position")
        this.quizQuestions = quizQuestions

        quizAdapter = QuizAdapter(quizQuestions ?: emptyList())
        if (taken == true) {
            showAlreadyTakenDialog()
        }
        Toast.makeText(requireContext(), "$taken", Toast.LENGTH_SHORT).show()
        binding.quizRecyclerView.apply {
            adapter = quizAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }


        binding.submitButton.setOnClickListener {
            val correctAnswers = evaluateAnswers()
            Toast.makeText(requireContext(), "You got $correctAnswers correct answers!", Toast.LENGTH_SHORT).show()
            updateUserPoints(correctAnswers)

            // Update the taken status in the local data
            val updatedDataList = viewModel.dataList.value.orEmpty()

            // Ensure position is not null and convert it safely to Int
            val quizPosition = position?.toInt() ?: -1
            Toast.makeText(requireContext(), "$position == $quizPosition", Toast.LENGTH_SHORT).show() // Debug message

            // Find the quiz item with the matching ID and update its taken status
            updatedDataList.firstOrNull { it.id == quizPosition }?.let { quiz ->
                quiz.taken = true
                viewModel._dataList.value = updatedDataList
            }
            viewModel.updateQuizTakenStatus(quizPosition)

            findNavController().navigateUp()
        }


    }
    private fun showAlreadyTakenDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Quiz Already Taken")
            .setMessage("You have already taken this quiz.")
            .setPositiveButton("OK") { _, _ ->
                findNavController().navigateUp()
            }
            .setCancelable(false)
            .create()
            .show()
    }

    private fun evaluateAnswers(): Int {
        var correctAnswers = 0
        quizQuestions?.forEachIndexed { index, question ->
            val selectedOptionIndex = quizAdapter.getSelectedOptionIndex(index)
            if (selectedOptionIndex == question.correctAnswer) {
                correctAnswers++
            }
        }
        return correctAnswers
    }

    private fun updateUserPoints(correctAnswers: Int) {
        GlobalScope.launch(Dispatchers.Main) {
            val userPoints = userPointsDao.getUserPoints()
            if (userPoints != null) {
                // Update points if userPoints exist
                val updatedUserPoints = UserPoints(userPoints.id, userPoints.points + correctAnswers)
                userPointsDao.updateUserPoints(updatedUserPoints)
            } else {
                // Insert new points if userPoints don't exist
                val newUserPoints = UserPoints(points = correctAnswers)
                userPointsDao.insertUserPoints(newUserPoints)
            }
        }
    }


}
