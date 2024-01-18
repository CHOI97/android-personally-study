package com.example.base.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.base.util.Constants.FAVORITE_PRODUCT_TABLE_NAME

@Entity(tableName="$FAVORITE_PRODUCT_TABLE_NAME")
data class Favorite(
    @ColumnInfo(name= "name")
    val name: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "thumbnail")
    val thumbnail: String
){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

