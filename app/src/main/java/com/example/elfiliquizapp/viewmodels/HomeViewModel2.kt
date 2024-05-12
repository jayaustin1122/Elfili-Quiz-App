package com.example.elfiliquizapp.viewmodels

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.elfiliquizapp.R
import com.example.elfiliquizapp.model.Datas
import com.example.elfiliquizapp.table.QuizQuestion


class HomeViewModel2 : ViewModel() {

    private val _dataList = MutableLiveData<List<Datas>>()
    val dataList: LiveData<List<Datas>> = _dataList
    private val originalDataList: MutableList<Datas> = mutableListOf()
    init {
        // Initialize your dataList here
        val initialList = listOf(

            Datas(R.drawable.chapter_1, R.string.kabanata_1, R.string.kabanata_1_content,
                  R.raw.kabanataone, quizQuestions = listOf(
                    QuizQuestion(
                        question = "What is the capital of France?",
                        options = listOf("London", "Berlin", "Paris", "Rome"),
                        correctAnswer = 2 // Paris is the correct answer
                    ),
                    QuizQuestion(
                        question = "Who wrote 'Romeo and Juliet'?",
                        options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
                        correctAnswer = 0 // William Shakespeare is the correct answer
                    ),
                    QuizQuestion(
                        question = "Which planet is known as the Red Planet?",
                        options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
                        correctAnswer = 1 // Mars is the correct answer
                    ),
                    QuizQuestion(
                        question = "What is the chemical symbol for water?",
                        options = listOf("H2O", "CO2", "NaCl", "CH4"),
                        correctAnswer = 0 // H2O is the correct answer
                    ),
                    QuizQuestion(
                        question = "Who was the first man to step on the moon?",
                        options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
                        correctAnswer = 1 // Neil Armstrong is the correct answer
                    )
                ),
                false),
            Datas(R.drawable.chapter_2, R.string.kabanata_2, R.string.kabanata_2_content,
                R.raw.kabanata_2, quizQuestions = listOf(
                    QuizQuestion(
                        question = "What is the capital of France?",
                        options = listOf("London", "Berlin", "Paris", "Rome"),
                        correctAnswer = 2 // Paris is the correct answer
                    ),
                    QuizQuestion(
                        question = "Who wrote 'Romeo and Juliet'?",
                        options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
                        correctAnswer = 0 // William Shakespeare is the correct answer
                    ),
                    QuizQuestion(
                        question = "Which planet is known as the Red Planet?",
                        options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
                        correctAnswer = 1 // Mars is the correct answer
                    ),
                    QuizQuestion(
                        question = "What is the chemical symbol for water?",
                        options = listOf("H2O", "CO2", "NaCl", "CH4"),
                        correctAnswer = 0 // H2O is the correct answer
                    ),
                    QuizQuestion(
                        question = "Who was the first man to step on the moon?",
                        options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
                        correctAnswer = 1 // Neil Armstrong is the correct answer
                    )
                ),
                false),
            Datas(R.drawable.chapter_3, R.string.kabanata_3, R.string.kabanata_3_content,
                R.raw.kabanata_3, quizQuestions = listOf(
                    QuizQuestion(
                        question = "What is the capital of France?",
                        options = listOf("London", "Berlin", "Paris", "Rome"),
                        correctAnswer = 2 // Paris is the correct answer
                    ),
                    QuizQuestion(
                        question = "Who wrote 'Romeo and Juliet'?",
                        options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
                        correctAnswer = 0 // William Shakespeare is the correct answer
                    ),
                    QuizQuestion(
                        question = "Which planet is known as the Red Planet?",
                        options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
                        correctAnswer = 1 // Mars is the correct answer
                    ),
                    QuizQuestion(
                        question = "What is the chemical symbol for water?",
                        options = listOf("H2O", "CO2", "NaCl", "CH4"),
                        correctAnswer = 0 // H2O is the correct answer
                    ),
                    QuizQuestion(
                        question = "Who was the first man to step on the moon?",
                        options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
                        correctAnswer = 1 // Neil Armstrong is the correct answer
                    )
                ),
                false),
            Datas(R.drawable.chapter_4, R.string.kabanata_4, R.string.kabanata_4_content,
                R.raw.kabanata_4, quizQuestions = listOf(
                    QuizQuestion(
                        question = "What is the capital of France?",
                        options = listOf("London", "Berlin", "Paris", "Rome"),
                        correctAnswer = 2 // Paris is the correct answer
                    ),
                    QuizQuestion(
                        question = "Who wrote 'Romeo and Juliet'?",
                        options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
                        correctAnswer = 0 // William Shakespeare is the correct answer
                    ),
                    QuizQuestion(
                        question = "Which planet is known as the Red Planet?",
                        options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
                        correctAnswer = 1 // Mars is the correct answer
                    ),
                    QuizQuestion(
                        question = "What is the chemical symbol for water?",
                        options = listOf("H2O", "CO2", "NaCl", "CH4"),
                        correctAnswer = 0 // H2O is the correct answer
                    ),
                    QuizQuestion(
                        question = "Who was the first man to step on the moon?",
                        options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
                        correctAnswer = 1 // Neil Armstrong is the correct answer
                    )
                ),
                false),
            Datas(R.drawable.chapter_5, R.string.kabanata_5, R.string.kabanata_5_content,
                R.raw.kabanata_5, quizQuestions = listOf(
                    QuizQuestion(
                        question = "What is the capital of France?",
                        options = listOf("London", "Berlin", "Paris", "Rome"),
                        correctAnswer = 2 // Paris is the correct answer
                    ),
                    QuizQuestion(
                        question = "Who wrote 'Romeo and Juliet'?",
                        options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
                        correctAnswer = 0 // William Shakespeare is the correct answer
                    ),
                    QuizQuestion(
                        question = "Which planet is known as the Red Planet?",
                        options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
                        correctAnswer = 1 // Mars is the correct answer
                    ),
                    QuizQuestion(
                        question = "What is the chemical symbol for water?",
                        options = listOf("H2O", "CO2", "NaCl", "CH4"),
                        correctAnswer = 0 // H2O is the correct answer
                    ),
                    QuizQuestion(
                        question = "Who was the first man to step on the moon?",
                        options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
                        correctAnswer = 1 // Neil Armstrong is the correct answer
                    )
                ),
                false),
            Datas(R.drawable.chapter_6, R.string.kabanata_6, R.string.kabanata_6_content,
            R.raw.kabanata_6, quizQuestions = listOf(
                QuizQuestion(
                    question = "What is the capital of France?",
                    options = listOf("London", "Berlin", "Paris", "Rome"),
                    correctAnswer = 2 // Paris is the correct answer
                ),
                QuizQuestion(
                    question = "Who wrote 'Romeo and Juliet'?",
                    options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
                    correctAnswer = 0 // William Shakespeare is the correct answer
                ),
                QuizQuestion(
                    question = "Which planet is known as the Red Planet?",
                    options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
                    correctAnswer = 1 // Mars is the correct answer
                ),
                QuizQuestion(
                    question = "What is the chemical symbol for water?",
                    options = listOf("H2O", "CO2", "NaCl", "CH4"),
                    correctAnswer = 0 // H2O is the correct answer
                ),
                QuizQuestion(
                    question = "Who was the first man to step on the moon?",
                    options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
                    correctAnswer = 1 // Neil Armstrong is the correct answer
                )
            ),
                false),
            Datas(R.drawable.chapter_7, R.string.kabanata_7, R.string.kabanata_7_content,
        R.raw.kabanata_7, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_8, R.string.kabanata_8, R.string.kabanata_8_content,
            R.raw.kabanata_8, quizQuestions = listOf(
                QuizQuestion(
                    question = "What is the capital of France?",
                    options = listOf("London", "Berlin", "Paris", "Rome"),
                    correctAnswer = 2 // Paris is the correct answer
                ),
                QuizQuestion(
                    question = "Who wrote 'Romeo and Juliet'?",
                    options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
                    correctAnswer = 0 // William Shakespeare is the correct answer
                ),
                QuizQuestion(
                    question = "Which planet is known as the Red Planet?",
                    options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
                    correctAnswer = 1 // Mars is the correct answer
                ),
                QuizQuestion(
                    question = "What is the chemical symbol for water?",
                    options = listOf("H2O", "CO2", "NaCl", "CH4"),
                    correctAnswer = 0 // H2O is the correct answer
                ),
                QuizQuestion(
                    question = "Who was the first man to step on the moon?",
                    options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
                    correctAnswer = 1 // Neil Armstrong is the correct answer
                )
            ),
                false),
            Datas(R.drawable.chapter_9, R.string.KABANATA_9, R.string.KABANATA_9_content,
        R.raw.kabanata_9, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_10, R.string.KABANATA_10, R.string.KABANATA_10_content,
        R.raw.kabanata_10, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_11, R.string.kabanata_11, R.string.kabanata_11_content,
        R.raw.kabanata_11, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_12, R.string.kabanata_12, R.string.kabanata_12_content,
        R.raw.kabanata_12, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_13, R.string.kabanata_13, R.string.kabanata_13_content,
        R.raw.kabanata_13, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_14, R.string.kabanata_14, R.string.kabanata_14_content,
        R.raw.kabanata_14, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_15, R.string.kabanata_15, R.string.kabanata_15_content,
        R.raw.kabanata_15, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_16, R.string.kabanata_16, R.string.kabanata_16_content,
        R.raw.kabanata_16, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_17, R.string.kabanata_17, R.string.kabanata_17_content,
        R.raw.kabanata_17, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_18, R.string.kabanata_18, R.string.kabanata_18_content,
        R.raw.kabanata_18, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_19, R.string.kabanata_19, R.string.kabanata_19_content,
        R.raw.kabanata_19, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_20, R.string.kabanata_20, R.string.kabanata_20_content,
        R.raw.kabanata_20, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_21, R.string.kabanata_21, R.string.kabanata_21_content,
        R.raw.kabanata_21, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_22, R.string.kabanata_22, R.string.kabanata_22_content,
        R.raw.kabanata_22, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_23,R.string.kabanata_23, R.string.kabanata_23_content,
        R.raw.kabanata_23, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
        //    Datas(R.drawable.c, R.string.kabanata_24, R.string.,R.raw.kabanata_24),
        //R.raw.kabanata_24, quizQuestions = listOf(
//        QuizQuestion(
//            question = "What is the capital of France?",
//            options = listOf("London", "Berlin", "Paris", "Rome"),
//            correctAnswer = 2 // Paris is the correct answer
//        ),
//        QuizQuestion(
//            question = "Who wrote 'Romeo and Juliet'?",
//            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
//            correctAnswer = 0 // William Shakespeare is the correct answer
//        ),
//        QuizQuestion(
//            question = "Which planet is known as the Red Planet?",
//            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
//            correctAnswer = 1 // Mars is the correct answer
//        ),
//        QuizQuestion(
//            question = "What is the chemical symbol for water?",
//            options = listOf("H2O", "CO2", "NaCl", "CH4"),
//            correctAnswer = 0 // H2O is the correct answer
//        ),
//        QuizQuestion(
//            question = "Who was the first man to step on the moon?",
//            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
//            correctAnswer = 1 // Neil Armstrong is the correct answer
//        )
//        ),
//                        false),
            Datas(R.drawable.chapter_25,R.string.kabanata_25, R.string.kabanata_25_content,
        R.raw.kabanata_25, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_26,R.string.kabanata_26, R.string.kabanata_26_content,
        R.raw.kabanata_26, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_27, R.string.kabanata_27, R.string.kabanata_27_content,
        R.raw.kabanata_27, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_28, R.string.kabanata_28, R.string.kabanata_28_content,
        R.raw.kabanata_28, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_29, R.string.kabanata_29, R.string.kabanata_29_content,
        R.raw.kabanata_29, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_30, R.string.kabanata_30, R.string.kabanata_30_content,
        R.raw.kabanata_30, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
          //  Datas(R.drawable.chapter_31, R.string.kabanata_31, R.string.kabanata_31_content,
        //R.raw.kabanata_31, quizQuestions = listOf(
//        QuizQuestion(
//            question = "What is the capital of France?",
//            options = listOf("London", "Berlin", "Paris", "Rome"),
//            correctAnswer = 2 // Paris is the correct answer
//        ),
//        QuizQuestion(
//            question = "Who wrote 'Romeo and Juliet'?",
//            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
//            correctAnswer = 0 // William Shakespeare is the correct answer
//        ),
//        QuizQuestion(
//            question = "Which planet is known as the Red Planet?",
//            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
//            correctAnswer = 1 // Mars is the correct answer
//        ),
//        QuizQuestion(
//            question = "What is the chemical symbol for water?",
//            options = listOf("H2O", "CO2", "NaCl", "CH4"),
//            correctAnswer = 0 // H2O is the correct answer
//        ),
//        QuizQuestion(
//            question = "Who was the first man to step on the moon?",
//            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
//            correctAnswer = 1 // Neil Armstrong is the correct answer
//        )
//        ),
//                        false),
            Datas(R.drawable.chapter_32, R.string.kabanata_32, R.string.kabanata_32_content,
        R.raw.kabanata_32, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_33, R.string.kabanata_33, R.string.kabanata_33_content,
        R.raw.kabanata_33, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_34, R.string.kabanata_34, R.string.kabanata_34_content,
        R.raw.kabanata_34, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_35, R.string.kabanata_35, R.string.kabanata_35_content,
        R.raw.kabanata_35, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_36, R.string.kabanata_36, R.string.kabanata_36_content,
        R.raw.kabanata_36, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_37, R.string.kabanata_37, R.string.kabanata_37_content,
        R.raw.kabanata_37, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_38, R.string.kabanata_38, R.string.kabanata_38_content,
        R.raw.kabanata_38, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
        ),
                false),
            Datas(R.drawable.chapter_39, R.string.kabanata_39, R.string.kabanata_39_content,
        R.raw.kabanata_39, quizQuestions = listOf(
        QuizQuestion(
            question = "What is the capital of France?",
            options = listOf("London", "Berlin", "Paris", "Rome"),
            correctAnswer = 2 // Paris is the correct answer
        ),
        QuizQuestion(
            question = "Who wrote 'Romeo and Juliet'?",
            options = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"),
            correctAnswer = 0 // William Shakespeare is the correct answer
        ),
        QuizQuestion(
            question = "Which planet is known as the Red Planet?",
            options = listOf("Venus", "Mars", "Jupiter", "Saturn"),
            correctAnswer = 1 // Mars is the correct answer
        ),
        QuizQuestion(
            question = "What is the chemical symbol for water?",
            options = listOf("H2O", "CO2", "NaCl", "CH4"),
            correctAnswer = 0 // H2O is the correct answer
        ),
        QuizQuestion(
            question = "Who was the first man to step on the moon?",
            options = listOf("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            correctAnswer = 1 // Neil Armstrong is the correct answer
        )
                ),
                false
            ),
        // Add more Datas as needed
        )
        originalDataList.addAll(initialList)
        _dataList.value = initialList
    }
    fun Datas.getAudioResId(): Int {
        return audioResId
    }
    fun filterData(context: Context, query: String) {
        val filteredList = if (query.isEmpty()) {
            originalDataList.toList()
        } else {
            originalDataList.filter { data ->
                context.getString(data.titleResId).contains(query, true)
            }
        }
        _dataList.value = filteredList
    }
}
