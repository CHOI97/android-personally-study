package com.example.base.repository

import com.example.base.model.ProductResponse
import com.example.base.network.Api
import com.example.base.network.RetrofitInstance.api
import com.example.base.repository.ProductRepository
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

}