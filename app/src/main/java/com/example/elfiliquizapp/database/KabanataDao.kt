package com.example.elfiliquizapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.elfiliquizapp.model.Kabanata
import com.example.elfiliquizapp.table.User

@Dao
interface  KabanataDao {
    @Insert
    suspend fun insertKabanata(kabanata: Kabanata)

    @Query("SELECT * FROM Kabanata WHERE number = :number")
    suspend fun getKabanata(number: Int): Kabanata?

}