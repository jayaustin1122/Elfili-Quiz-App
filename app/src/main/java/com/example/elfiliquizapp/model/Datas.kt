package com.example.elfiliquizapp.model

import androidx.annotation.StringRes
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.elfiliquizapp.table.QuizQuestion

@Entity
data class Datas(
    val id: Int = 0,
    val imageResId: Int,
    @StringRes val titleResId: Int,
    @StringRes val contentResId: Int,
    val audioResId: Int, // Add audio resource ID
    val quizQuestions: List<QuizQuestion>,
    var taken : Boolean
)