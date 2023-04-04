package com.example.kotlin_modern_kakao_book_api.util

import com.example.kotlin_modern_kakao_book_api.BuildConfig

object Constants {
    const val BASE_URL = "https://dapi.kakao.com/"
    const val API_KEY = BuildConfig.kakao_api_key

    // secrets gradle plug-in 사용도 가능
    const val SEARCH_BOOKS_TIME_DELAY = 100L

    // DataStore
    const val DATASTORE_NAME = "preferences_datastore"

    // Paging
    const val PAGING_SIZE = 15
}