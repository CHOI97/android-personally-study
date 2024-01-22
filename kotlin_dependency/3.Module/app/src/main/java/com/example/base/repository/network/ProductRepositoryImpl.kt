package com.example.base.repository.network

import com.example.base.model.ProductListResponse
import com.example.base.model.ProductResponse
import com.example.base.network.Api
import com.example.base.repository.network.ProductRepository
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductRepositoryImpl @Inject constructor(
    private val api: Api
): ProductRepository {
    override suspend fun getPost(number: Int): Response<ProductResponse> {
        return api.getPost(number)
    }

    override suspend fun getPostAll(): Response<ProductListResponse> {
        return api.getPostAll()
    }

}