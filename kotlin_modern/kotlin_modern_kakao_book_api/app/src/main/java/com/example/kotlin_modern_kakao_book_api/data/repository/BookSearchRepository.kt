package com.example.kotlin_modern_kakao_book_api.data.repository

import com.example.kotlin_modern_kakao_book_api.data.model.SearchResponse
import retrofit2.Response


interface BookSearchRepository {

    suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int
    ): Response<SearchResponse>
}