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

    @Query("SELECT points FROM user_points ")
    suspend fun getUserPoints(): UserPoints?

    @Update
    suspend fun updateUserPoints(userId: Int, newPoints: Int)
}
