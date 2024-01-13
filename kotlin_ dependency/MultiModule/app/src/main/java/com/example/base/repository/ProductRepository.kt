package com.example.base.repository

import com.example.base.model.ProductResponse
import retrofit2.Response
import javax.inject.Inject

interface ProductRepository {
    suspend fun getPost(number: Int) : Response<ProductResponse>
}