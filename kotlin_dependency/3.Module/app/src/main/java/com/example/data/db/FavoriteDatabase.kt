package com.example.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(
    entities = [Favorite::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(ListConverter::class)
abstract class FavoriteDatabase: RoomDatabase(){

    abstract fun favoriteDao(): FavoriteDao

}