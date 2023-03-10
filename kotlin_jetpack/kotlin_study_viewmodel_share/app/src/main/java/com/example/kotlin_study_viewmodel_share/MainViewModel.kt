package com.example.kotlin_study_viewmodel_share

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var countValue = 0

    fun plus(){
        countValue++
    }
    fun minus(){
        countValue--
    }
    fun getCount(): Int{
        return countValue
    }
}