package com.example.kotlin_modern_kakao_book_api.data.api

import com.example.kotlin_modern_kakao_book_api.data.model.SearchResponse
import com.example.kotlin_modern_kakao_book_api.util.Constants.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface BookSearchApi {

    @Headers("Authorization: KakaoAK $API_KEY")
    @GET("/v3/search/book")
    suspend fun searchBooks(
        @Query("query") query: String,
        @Query("sort") sort: String,
        @Query("page") page: Int,
        @Query("size") size: Int
    ): Response<SearchResponse>
}