package com.example.elfiliquizapp.ui

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.ProgressDialog
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.elfiliquizapp.adapter.QuizAdapter
import com.example.elfiliquizapp.database.ElfiliDatabase
import com.example.elfiliquizapp.database.StatusDao
import com.example.elfiliquizapp.databinding.FragmentQuizBinding
import com.example.elfiliquizapp.table.QuizQuestion
import com.example.elfiliquizapp.database.UserPointsDao
import com.example.elfiliquizapp.databinding.DialogGlossaryBinding
import com.example.elfiliquizapp.table.UserPoints
import com.example.elfiliquizapp.viewmodels.HomeViewModel2
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class QuizFragment : Fragment() {
    private lateinit var binding: FragmentQuizBinding
    private lateinit var quizAdapter: QuizAdapter
    private var quizQuestions: List<QuizQuestion>? = null
    private lateinit var progressDialog : ProgressDialog
    private lateinit var viewModel: HomeViewModel2
    // Database instance
    private lateinit var userPointsDao: UserPointsDao
    private lateinit var statusDao: StatusDao

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuizBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        progressDialog = ProgressDialog(this.requireContext())
        progressDialog.setTitle("Please wait")
        progressDialog.setCanceledOnTouchOutside(false)

        viewModel = ViewModelProvider(requireActivity()).get(HomeViewModel2::class.java)
        statusDao = ElfiliDatabase.invoke(requireContext()).getStatus()
        userPointsDao = ElfiliDatabase.invoke(requireContext()).getUserPointsDao()

        val quizQuestions = arguments?.getSerializable("quizQuestions") as? List<QuizQuestion>
        val taken = arguments?.getBoolean("taken") ?: false
        val position = arguments?.getString("id")
        this.quizQuestions = quizQuestions
        val newPosition = position + 1

        lifecycleScope.launch(Dispatchers.IO) {
            val status = statusDao.getStatusById(newPosition.toLong())
            status?.let { // Ensuring status is not null
                if (!it.state) {
                    withContext(Dispatchers.Main) {
                        // Perform action if state is false
                    }
                } else {
                    // State is true, show dialog
                    withContext(Dispatchers.Main) {
                        showAlreadyTakenDialog()
                    }
                }
            }
        }

        quizAdapter = QuizAdapter(quizQuestions ?: emptyList())
        if (taken) {
            showAlreadyTakenDialog()
        }
        binding.quizRecyclerView.apply {
            adapter = quizAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        binding.submitButton.setOnClickListener {
            progressDialog.setMessage("Kinakalkula ang Tamang Mga Sagot...")
            progressDialog.show()
            Handler().postDelayed({

                val correctAnswers = evaluateAnswers()
                Toast.makeText(requireContext(), "Ikaw ay Nakakuha ng $correctAnswers tamang sagot!", Toast.LENGTH_SHORT).show()
                showGlossaryDialog(correctAnswers)
                updateUserPoints(correctAnswers)
                lifecycleScope.launch(Dispatchers.IO) {
                    statusDao.updateStatusById(newPosition.toLong(), true)
                }
            }, 3000)
        }
        binding.back.setOnClickListener {
            findNavController().navigateUp()
        }
    }
    @SuppressLint("SetTextI18n")
    private fun showGlossaryDialog(correctAnswers: Int) {
        val dialogView = DialogGlossaryBinding.inflate(layoutInflater)
        dialogView.dialogTitle.text = "Mabuhay!"
        dialogView.dialogDescription.text = "Ikaw ay Nakakuha ng $correctAnswers tamang sagot!${if (correctAnswers != 1) "s" else ""}!"

        AlertDialog.Builder(requireContext())
            .setView(dialogView.root)
            .setPositiveButton("OK", null)
            .show()
    }

    private fun showAlreadyTakenDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Nakumpleto na ang Pagsusulit.")
            .setMessage("Nakumpleto mo na ang pagsusulit na ito.")
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
        progressDialog.dismiss()
        val points = when {
            correctAnswers >= 5 -> 3
            correctAnswers == 4 -> 2
            correctAnswers < 4 -> 1
            else -> 0
        }

        GlobalScope.launch(Dispatchers.Main) {
            val userPoints = userPointsDao.getUserPoints()
            if (userPoints != null) {
                // Update points if userPoints exist
                val updatedUserPoints = UserPoints(userPoints.id, userPoints.points + points)
                userPointsDao.updateUserPoints(updatedUserPoints)
                findNavController().navigateUp()
            } else {
                // Insert new points if userPoints don't exist
                val newUserPoints = UserPoints(points = points)
                userPointsDao.insertUserPoints(newUserPoints)
                findNavController().navigateUp()
            }
        }
    }
}
