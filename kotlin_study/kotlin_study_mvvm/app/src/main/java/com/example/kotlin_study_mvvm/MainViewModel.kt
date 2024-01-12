package com.example.kotlin_study_mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(): ViewModel(){

    private val mainRepository = MainRepository()

    // 데이터를 캡슐화하여 외부(뷰)에서 접근할 수 없도록하고
    // 외부 접근 프로퍼티는 immutable 타입으로 제한해 변경할 수 없도록 한다.
    private val _data = MutableLiveData<String>("")
    val data: LiveData<String> = _data

    fun getData(){
        _data.value = mainRepository.getData()
    }
}
