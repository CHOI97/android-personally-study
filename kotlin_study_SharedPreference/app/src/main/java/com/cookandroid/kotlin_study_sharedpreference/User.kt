package com.cookandroid.kotlin_study_sharedpreference

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "age") val age:Int,
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name="userId")val userId: Int = 0
    //autoGenrate 자동으로 증가
)
