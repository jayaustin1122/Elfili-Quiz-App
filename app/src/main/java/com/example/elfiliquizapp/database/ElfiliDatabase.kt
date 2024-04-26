package com.example.elfiliquizapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.elfiliquizapp.model.Kabanata
import com.example.elfiliquizapp.table.User

@Database(
    entities = [User::class, Kabanata::class], //add ko pa ung entity para sa user points
    version = 1
)
abstract class ElfiliDatabase : RoomDatabase() {
    abstract fun getUserDao(): UserDao
    abstract fun getKabanata(): KabanataDao

    companion object {
        // to access all
        @Volatile
        private var instance: ElfiliDatabase? = null
        private val LOCK = Any()

        //cheking the db if exist
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also{
                instance = it
            }
        }
        //to create db if db is not created
        private fun buildDatabase(context:Context) = Room.databaseBuilder(
            context.applicationContext,
            ElfiliDatabase::class.java,
            "elfilibus.db"
        ).build()

    }

}