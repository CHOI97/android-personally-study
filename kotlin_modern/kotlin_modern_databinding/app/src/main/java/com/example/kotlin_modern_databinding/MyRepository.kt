package com.example.kotlin_modern_databinding

import androidx.lifecycle.LiveData

interface MyRepository {
    fun getCounter() : LiveData<Int>
    fun increaseCounter()
}