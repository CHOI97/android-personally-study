package com.example.kotlin_study_room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlin_study_room.entity.TextEntity
import com.example.kotlin_study_room.entity.WordEntity

@Dao
interface WordDao {

    @Query("SELECT * FROM word_table")
    fun getAllData(): List<WordEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(text: WordEntity)

    @Query("DELETE FROM word_table")
    fun deleteAllData()
}