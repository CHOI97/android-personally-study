package com.example.kotlin_modern_kakao_book_api.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.kotlin_modern_kakao_book_api.data.model.Book


@Database(
    entities = [Book::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(OrmConverter::class)
abstract class BookSearchDatabase : RoomDatabase() {

    abstract fun bookSearchDao(): BookSearchDao

    companion object {
        @Volatile
        private var INSTANCE: BookSearchDatabase? = null
//
//        private fun buildDatabase(context: Context): BookSearchDatabase =
//            Room.databaseBuilder(
//                context.applicationContext,
//                BookSearchDatabase::class.java,
//                "favorite-books"
//            ).build()
//
//        fun getInstance(context: Context): BookSearchDatabase =
//            INSTANCE ?: synchronized(this) {
//                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
//            }
//    }
    }
}