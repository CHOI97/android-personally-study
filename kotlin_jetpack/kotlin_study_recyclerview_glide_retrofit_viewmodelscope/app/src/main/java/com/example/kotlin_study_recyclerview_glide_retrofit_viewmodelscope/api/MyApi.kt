package com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.api

import com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.model.Plant
import retrofit2.http.GET

interface MyApi {

    @GET("googlecodelabs/kotlin-coroutines/master/advanced-coroutines-codelab/sunflower/src/main/assets/plants.json")
    suspend fun getAllPlants() : List<Plant>

}