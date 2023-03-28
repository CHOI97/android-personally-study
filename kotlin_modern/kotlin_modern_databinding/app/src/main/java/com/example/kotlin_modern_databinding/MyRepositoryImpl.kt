package com.example.kotlin_modern_databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyRepositoryImpl(counter: Int): MyRepository {
    private val liveCounter = MutableLiveData<Int>(counter)
    override fun getCounter(): LiveData<Int> {
        return liveCounter
    }

    override fun increaseCounter() {
        liveCounter.value = liveCounter.value?.plus(1)
    }

}