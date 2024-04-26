package com.example.elfiliquizapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Kabanata (
    val number: Int,
    val isBoolean: Boolean,
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
)