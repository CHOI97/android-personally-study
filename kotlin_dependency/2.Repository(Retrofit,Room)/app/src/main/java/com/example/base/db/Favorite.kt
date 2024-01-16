package com.example.base.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.base.util.Constants.FAVORITE_PRODUCT_TABLE_NAME

@Entity(tableName="$FAVORITE_PRODUCT_TABLE_NAME")
data class Favorite(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo("name")
    val name: String,
    @ColumnInfo("description")
    val description: String,
    @ColumnInfo("thumbnail")
    val thumbnail: String
)
