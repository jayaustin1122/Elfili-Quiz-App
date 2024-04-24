package com.example.elfiliquizapp.table

import java.io.Serializable

data class QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctAnswer: Int
) : Serializable