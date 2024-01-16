package com.example.base.db

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [Favorite::class],
    version = 1,
    exportSchema = false
)
abstract class FavoriteDatabase: RoomDatabase(){

    abstract fun favoriteDao(): FavoriteDao

    companion object{
        @Volatile
        private var INSTANCE: FavoriteDatabase? = null
    }
}