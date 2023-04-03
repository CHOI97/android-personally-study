package com.example.kotlin_modern_kakao_book_api.data.repository

import com.example.kotlin_modern_kakao_book_api.data.model.Book
import com.example.kotlin_modern_kakao_book_api.data.model.SearchResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response


interface BookSearchRepository {

    suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int
    ): Response<SearchResponse>

    suspend fun insertBook(book: Book)

    suspend fun deleteBook(book: Book)

    // LiveData -> Flow
    fun getFavoriteBooks(): Flow<List<Book>>

    // DataStore
    suspend fun saveSortMode(mode: String)

    suspend fun getSortMode(): Flow<String>
}