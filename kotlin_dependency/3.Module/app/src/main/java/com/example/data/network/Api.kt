package com.example.data.network

import com.example.data.model.ProductListResponse
import com.example.data.model.ProductResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {

    @GET("products/{number}")
    suspend fun getPost(
        @Path("number") number : Int
    ): Response<ProductResponse>

    @GET("products/")
    suspend fun getPostAll(): Response<ProductListResponse>
}