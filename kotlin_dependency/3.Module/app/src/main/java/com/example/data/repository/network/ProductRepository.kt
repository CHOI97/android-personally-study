package com.example.data.repository.network

import com.example.data.model.ProductListResponse
import com.example.data.model.ProductResponse
import retrofit2.Response

interface ProductRepository {
    suspend fun getPost(number: Int) : Response<ProductResponse>
    suspend fun getPostAll(): Response<ProductListResponse>
}