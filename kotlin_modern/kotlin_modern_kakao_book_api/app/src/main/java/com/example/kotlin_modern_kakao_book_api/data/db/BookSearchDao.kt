package com.example.kotlin_modern_kakao_book_api.data.db

import androidx.paging.PagingSource
import androidx.room.*
import com.example.kotlin_modern_kakao_book_api.data.model.Book
import kotlinx.coroutines.flow.Flow

@Dao
interface BookSearchDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBook(book: Book)

    @Delete
    suspend fun deleteBook(book: Book)

    // LiveData -> Flow
    @Query("SELECT * FROM books")
    fun getFavoriteBooks(): Flow<List<Book>>

    @Query("SELECT * FROM books")
    fun getFavoritePagingBooks(): PagingSource<Int, Book>
}