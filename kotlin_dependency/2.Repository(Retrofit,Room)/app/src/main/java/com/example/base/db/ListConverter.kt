package com.example.base.db

import androidx.room.TypeConverter
import com.google.gson.Gson

class ListConverter {
    @TypeConverter
    fun listToJson(list: List<Favorite>?) = Gson().toJson(list)

    @TypeConverter
    fun jsonToList(value: String) = Gson().fromJson(value, Array<Favorite>::class.java).toList()
}
