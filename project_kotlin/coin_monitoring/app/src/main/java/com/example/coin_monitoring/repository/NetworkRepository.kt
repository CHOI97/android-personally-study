package com.example.coin_monitoring.repository

import com.example.coin_monitoring.network.Api
import com.example.coin_monitoring.network.RetrofitInstance

// 관리에 용이하다..?

class NetworkRepository {
    private val client = RetrofitInstance.getInstance().create(Api::class.java)

    suspend fun getCurrentCoinList() = client.getCurrentCoinList()

}