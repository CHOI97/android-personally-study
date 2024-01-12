package com.example.kotlin_study_2way_databinding_livedata

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    val _textLiveData = MutableLiveData<String>()
//    val textLiveData: LiveData<String>
//        get() = _textLiveData
    val _editLiveData = MutableLiveData<String>()
//    val editLiveData: LiveData<String>
//     get()= _editLiveData
    private val _hasChecked = MutableLiveData<Boolean>()
//    val hasChecked: LiveData<Boolean>
//        get()= _hasChecked

    init {
//        _hasChecked.value = true
        _editLiveData.value = "init 테스트"
        _textLiveData.value = "init 테스트"
    }

    fun printAllData(){
//        Log.d("text LiveData is ",textLiveData.value.toString())
        Log.d("_text LiveData is ",_textLiveData.value.toString())
//        Log.d("edit LiveData is ",editLiveData.value.toString())
        Log.d("_edit LiveData is ",_editLiveData.value.toString())
//        Log.d("check LiveData is",hasChecked.value.toString())
//        Log.d("_check LiveData is",_hasChecked.value.toString())
    }
}