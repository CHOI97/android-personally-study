package com.example.kotlin_modern_kakao_book_api.data.repository

import androidx.lifecycle.LiveData
import com.example.kotlin_modern_kakao_book_api.data.model.Book
import com.example.kotlin_modern_kakao_book_api.data.model.SearchResponse
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

    fun getFavoriteBooks(): LiveData<List<Book>>
}