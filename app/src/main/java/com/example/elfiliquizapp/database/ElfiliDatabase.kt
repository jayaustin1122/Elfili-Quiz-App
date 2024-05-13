package com.example.elfiliquizapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.elfiliquizapp.model.Datas
import com.example.elfiliquizapp.model.Kabanata
import com.example.elfiliquizapp.table.Status
import com.example.elfiliquizapp.table.User
import com.example.elfiliquizapp.table.UserPoints

@Database(
    entities = [User::class, Kabanata::class, UserPoints::class, Status::class],
    version = 3
)
abstract class ElfiliDatabase : RoomDatabase() {

    abstract fun getUserDao(): UserDao
    abstract fun getKabanata(): KabanataDao
    abstract fun getUserPointsDao(): UserPointsDao
    abstract fun getStatus(): StatusDao

    companion object {
        @Volatile
        private var instance: ElfiliDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            ElfiliDatabase::class.java,
            "elfilibus.db"
        ).fallbackToDestructiveMigration() // This will allow for destructive migrations
            .build()


    }
}
