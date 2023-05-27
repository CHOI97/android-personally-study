package com.example.kotlin_study_room_coroutine_flow.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "text_table")
data class TextEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    val id:Int,
    @ColumnInfo(name="text")
    val text: String
)