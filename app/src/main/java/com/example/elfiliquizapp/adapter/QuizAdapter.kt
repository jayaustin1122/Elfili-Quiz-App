package com.example.elfiliquizapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.recyclerview.widget.RecyclerView
import com.example.elfiliquizapp.databinding.ItemQuizQuestionBinding
import com.example.elfiliquizapp.table.QuizQuestion

class QuizAdapter(private val quizQuestions: List<QuizQuestion>) :
    RecyclerView.Adapter<QuizAdapter.QuizViewHolder>() {

    inner class QuizViewHolder(private val binding: ItemQuizQuestionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(question: QuizQuestion) {
            binding.questionTextView.text = question.question
            binding.optionsRadioGroup.removeAllViews()
            question.options.forEach { option ->
                val radioButton = RadioButton(itemView.context)
                radioButton.text = option
                binding.optionsRadioGroup.addView(radioButton)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemQuizQuestionBinding.inflate(inflater, parent, false)
        return QuizViewHolder(binding)
    }

    override fun onBindViewHolder(holder: QuizViewHolder, position: Int) {
        holder.bind(quizQuestions[position])
    }

    override fun getItemCount(): Int {
        return quizQuestions.size
    }
}
