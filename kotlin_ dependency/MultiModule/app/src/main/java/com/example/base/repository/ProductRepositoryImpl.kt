package com.example.base.repository

import com.example.base.model.ProductResponse
import com.example.base.network.Api
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductRepositoryImpl @Inject constructor(
    private val api: Api
): ProductRepository{
    override suspend fun getPost(number: Int): Response<ProductResponse> {
        return api.getPost(number)
    }

    override suspend fun getPostAll(): Response<List<ProductResponse>> {
        return api.getPostAll()
    }

}