package com.example.kotlin_modern_kakao_book_api.data.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchResponse(
    val documents: List<Book>,
    val meta: Meta
)