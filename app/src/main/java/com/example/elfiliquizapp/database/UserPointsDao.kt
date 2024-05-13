package com.example.elfiliquizapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.elfiliquizapp.table.UserPoints

@Dao
interface UserPointsDao {

    @Insert
    suspend fun insertUserPoints(userPoints: UserPoints)

    @Query("SELECT * FROM user_points LIMIT 1")
    suspend fun getUserPoints(): UserPoints?

    @Update
    suspend fun updateUserPoints(userPoints: UserPoints)
}

