package com.example.kotlin_study_livedata_transformation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    // Transformations -> map / switchMap

    // map -> 값을 return

    private var _mutableCount = MutableLiveData(0)
    val liveCount : LiveData<Int>
        get() = _mutableCount

    val mapLiveData = Transformations.map(liveCount){
        it+it
    }
    val switchMapLiveData = Transformations.switchMap(liveCount){
        changeValue(it)
    }

    fun setLiveDataValue(count: Int){
        _mutableCount.value = count
    }

    fun changeValue(count : Int): MutableLiveData<Int>{
        val testLiveData = MutableLiveData(count*count)
        return testLiveData
    }
}