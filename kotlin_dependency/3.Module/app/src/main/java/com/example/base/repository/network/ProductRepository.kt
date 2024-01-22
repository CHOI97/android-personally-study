package com.example.base.repository.network

import com.example.base.model.ProductListResponse
import com.example.base.model.ProductResponse
import retrofit2.Response

interface ProductRepository {
    suspend fun getPost(number: Int) : Response<ProductResponse>
    suspend fun getPostAll(): Response<ProductListResponse>
}