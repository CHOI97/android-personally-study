package com.example.kotlin_study_pretask

import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("title")
    val title: String,

    @SerializedName("charge")
    val charge: Int
)
