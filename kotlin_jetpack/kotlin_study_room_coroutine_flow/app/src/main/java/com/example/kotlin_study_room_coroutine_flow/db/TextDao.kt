package com.example.kotlin_study_room_coroutine_flow.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TextDao {
    @Query("SELECT * FROM text_table")
    fun getAllData(): List<TextEntity>

    @Query("SELECT * FROM text_table")
    fun getAllDataFlow(): Flow<List<TextEntity>>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(text: TextEntity)

    @Query("DELETE FROM text_table")
    fun deleteAllData()
}