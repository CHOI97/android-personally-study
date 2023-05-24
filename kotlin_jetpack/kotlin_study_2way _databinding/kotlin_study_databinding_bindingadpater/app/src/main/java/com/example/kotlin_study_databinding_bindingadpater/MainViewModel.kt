package com.example.kotlin_study_databinding_bindingadpater

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _point =  MutableLiveData(0)

    val point : LiveData<Int> =  _point

    // LiveData를 변경해주는 친구
    val myPointType: LiveData<MyPointType> = Transformations.map(_point){
        when{
            it > 80 -> {MyPointType.BIG}
            it > 50 -> {MyPointType.MEDIUM}
            it > 30 -> {MyPointType.SMALL}
            else -> {MyPointType.VERY_SMALL}
        }
    }
    fun pointPlus(){
        _point.value = _point.value?.plus(10)
    }
}

// 4가지 분류 Big / Medium / Small / Very_Small


// 몇가지 타입으로 고정해서 사용하고 싶을때
enum class MyPointType{
    BIG,
    MEDIUM,
    SMALL,
    VERY_SMALL

}