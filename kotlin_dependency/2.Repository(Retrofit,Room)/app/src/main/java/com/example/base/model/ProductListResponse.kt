package com.example.base.model

import com.google.gson.annotations.SerializedName

data class ProductListResponse(
    @SerializedName("products")
    val productList: List<ProductResponse>
)
