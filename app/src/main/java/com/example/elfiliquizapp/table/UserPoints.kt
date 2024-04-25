package com.example.elfiliquizapp.table

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_points")
data class UserPoints(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val userId: Int, // Foreign key to link with user table
    val points: Int
)