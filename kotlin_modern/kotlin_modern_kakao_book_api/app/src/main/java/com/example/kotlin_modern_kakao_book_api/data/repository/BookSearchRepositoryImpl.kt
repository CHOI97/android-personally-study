package com.example.kotlin_modern_kakao_book_api.data.repository

import com.example.kotlin_modern_kakao_book_api.data.api.RetrofitInstance.api
import com.example.kotlin_modern_kakao_book_api.data.model.SearchResponse
import retrofit2.Response

class BookSearchRepositoryImpl : BookSearchRepository {
    override suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int
    ): Response<SearchResponse> {
        return api.searchBooks(query, sort, page, size)
    }
}