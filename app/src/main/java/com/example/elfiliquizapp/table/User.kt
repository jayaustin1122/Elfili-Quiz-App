package com.example.elfiliquizapp.table

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(

    val name: String ,
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0
)
