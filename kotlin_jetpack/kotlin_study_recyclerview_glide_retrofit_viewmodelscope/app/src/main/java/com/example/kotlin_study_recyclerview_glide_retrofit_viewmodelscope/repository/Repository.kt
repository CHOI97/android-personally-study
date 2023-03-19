package com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.repository

import com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.api.MyApi
import com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.api.RetrofitInstance

class Repository {

    private val client = RetrofitInstance.getInstance().create(MyApi::class.java)

    suspend fun getAllData() = client.getAllPlants()

}