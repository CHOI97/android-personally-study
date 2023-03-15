package com.example.coin_monitoring.network.model

data class CurrentPriceList(
    val status: String,
    val data: Map<String, Any>
)
