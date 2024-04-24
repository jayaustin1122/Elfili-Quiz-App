package com.example.elfiliquizapp.model

import androidx.annotation.StringRes
import com.example.elfiliquizapp.table.QuizQuestion

data class Datas(
    val imageResId: Int,
    @StringRes val titleResId: Int,
    @StringRes val contentResId: Int,
    val audioResId: Int , // Add audio resource ID
    val quizQuestions: List<QuizQuestion>
)