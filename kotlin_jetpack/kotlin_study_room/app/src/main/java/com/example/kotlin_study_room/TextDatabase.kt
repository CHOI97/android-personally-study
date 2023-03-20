package com.example.kotlin_study_room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TextEntity::class], version = 1)
abstract class TextDatabase : RoomDatabase(){
    abstract fun textDao() : TextDao

    companion object{
        @Volatile
        private var INSTANCE : TextDatabase? = null

        fun getDatabase(
            context: Context
        ): TextDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TextDatabase::class.java,
                    "text_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}