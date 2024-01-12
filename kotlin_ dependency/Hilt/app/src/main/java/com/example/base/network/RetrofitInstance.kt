package com.example.base.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val BASE_URL = "https://dummyjson.com/"

    private val okHttpClient: OkHttpClient by lazy {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }
    private val retrofit : Retrofit by lazy{
        Retrofit.Builder().client(okHttpClient)
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    }


    val api: Api by lazy{
        retrofit.create(Api::class.java)
    }
}