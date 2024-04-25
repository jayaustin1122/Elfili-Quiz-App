package com.example.elfiliquizapp.table

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    val name: String,
    val number: Int,
    val isBoolean: Boolean,
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val position: String
)
