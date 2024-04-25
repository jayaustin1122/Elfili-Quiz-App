package com.example.elfiliquizapp.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.recyclerview.widget.RecyclerView
import com.example.elfiliquizapp.databinding.ItemQuizQuestionBinding
import com.example.elfiliquizapp.table.QuizQuestion

class QuizAdapter(private val quizQuestions: List<QuizQuestion>) :
    RecyclerView.Adapter<QuizAdapter.QuizViewHolder>() {

    // Array to store the selected option index for each question
    private val selectedOptions = Array(quizQuestions.size) { -1 }

    inner class QuizViewHolder(private val binding: ItemQuizQuestionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(question: QuizQuestion, position: Int) {
            binding.questionTextView.text = question.question
            binding.optionsRadioGroup.removeAllViews()
            question.options.forEachIndexed { index, option ->
                val radioButton = RadioButton(itemView.context)
                radioButton.text = option
                radioButton.setOnClickListener {
                    // Update the selected option index for this question
                    selectedOptions[position] = index
                }
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
        holder.bind(quizQuestions[position], position)
    }

    override fun getItemCount(): Int {
        return quizQuestions.size
    }

    // Function to get the selected option index for a given question position
    fun getSelectedOptionIndex(position: Int): Int {
        return selectedOptions[position]
    }
}

