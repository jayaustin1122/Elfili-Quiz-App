package com.example.elfiliquizapp.database

import androidx.room.Dao
import androidx.room.Insert
import com.example.elfiliquizapp.table.UserPoints

@Dao
interface UserPointsDao {
    @Insert
    suspend fun insertUserPoints(userPoints: UserPoints)
}
