package com.example.kotlin_modern_kakao_book_api.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.kotlin_modern_kakao_book_api.data.model.Book

@Dao
interface BookSearchDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBook(book: Book)

    @Delete
    suspend fun deleteBook(book: Book)

    @Query("SELECT * FROM books")
    fun getFavoriteBooks(): LiveData<List<Book>>
}