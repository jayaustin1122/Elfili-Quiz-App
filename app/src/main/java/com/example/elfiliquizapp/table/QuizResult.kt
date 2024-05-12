package com.example.elfiliquizapp.table

data class QuizResult(
    val userId: Int,
    val quizId: Int,
    val correctAnswers: Int,
    val isQuizTaken: Boolean
)