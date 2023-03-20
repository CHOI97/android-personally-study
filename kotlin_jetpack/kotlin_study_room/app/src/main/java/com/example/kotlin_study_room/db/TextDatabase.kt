package com.example.kotlin_study_room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.kotlin_study_room.dao.TextDao
import com.example.kotlin_study_room.dao.WordDao
import com.example.kotlin_study_room.entity.TextEntity
import com.example.kotlin_study_room.entity.WordEntity

@Database(entities = [TextEntity::class,WordEntity::class], version = 2)
abstract class TextDatabase : RoomDatabase(){
    abstract fun textDao() : TextDao
    abstract fun wordDao() : WordDao

    companion object{
        @Volatile
        private var INSTANCE : TextDatabase? = null

        fun getDatabase(
            context: Context
        ): TextDatabase {
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