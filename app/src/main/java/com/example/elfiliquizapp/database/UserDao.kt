package com.example.elfiliquizapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.elfiliquizapp.table.User

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM User ")
    suspend fun getSingleUser(): User?
    @Query("SELECT * FROM User WHERE position = :position")
    suspend fun getKabanata(position: String): User?
}
