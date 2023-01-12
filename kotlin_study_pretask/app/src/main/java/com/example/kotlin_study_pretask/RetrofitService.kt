package com.example.kotlin_study_pretask

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {

    @GET("${BuildConfig.GET_PATH}")
    fun getBookData(): Call<Book>
}