package com.example.elfiliquizapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.elfiliquizapp.adapter.QuizAdapter
import com.example.elfiliquizapp.databinding.FragmentQuizBinding
import com.example.elfiliquizapp.table.QuizQuestion

class QuizFragment : Fragment() {
    private lateinit var binding : FragmentQuizBinding
    private lateinit var quizAdapter: QuizAdapter
    private var quizQuestions: List<QuizQuestion>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuizBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val quizQuestions = arguments?.getSerializable("quizQuestions") as? List<QuizQuestion>
        this.quizQuestions = quizQuestions
        quizAdapter = QuizAdapter(quizQuestions ?: emptyList())
        binding.quizRecyclerView.apply {
            adapter = quizAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }


        // Set click listener for the submit button
        binding.submitButton.setOnClickListener {
            val correctAnswers = evaluateAnswers()
            Toast.makeText(requireContext(), "You got $correctAnswers correct answers!", Toast.LENGTH_SHORT).show()
        }


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

}