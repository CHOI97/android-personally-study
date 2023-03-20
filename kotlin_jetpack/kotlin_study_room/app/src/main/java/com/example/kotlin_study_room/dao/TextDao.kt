package com.example.kotlin_study_room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlin_study_room.entity.TextEntity

@Dao
interface TextDao {

    @Query("SELECT * FROM text_table")
    fun getAllData(): List<TextEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(text: TextEntity)

    @Query("DELETE FROM text_table")
    fun deleteAllData()
}