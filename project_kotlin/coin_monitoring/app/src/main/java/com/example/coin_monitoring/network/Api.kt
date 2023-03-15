package com.example.coin_monitoring.network

import com.example.coin_monitoring.network.model.CurrentPriceList
import retrofit2.http.GET

interface Api {
    @GET("public/tickers/ALL_KRW")
    suspend fun getCurrentCoinList(): CurrentPriceList
}