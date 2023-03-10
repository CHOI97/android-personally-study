package com.example.kotlin_study_viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

// ViewModel 에서 저렇게 아래와 같이 딸랑 변수 하나만 만들어서 사용하지는 않는다.
// LiveData (등등)을 이용해서 함께 사용한다.
class MainViewModel: ViewModel() {

    var countValue = 0

    fun plus(){
        countValue++
        Log.d("MainViewModel",countValue.toString())
    }
    fun minus(){
        countValue--
        Log.d("MainViewModel",countValue.toString())
    }

    fun getCount(): Int{
        return countValue
    }
}