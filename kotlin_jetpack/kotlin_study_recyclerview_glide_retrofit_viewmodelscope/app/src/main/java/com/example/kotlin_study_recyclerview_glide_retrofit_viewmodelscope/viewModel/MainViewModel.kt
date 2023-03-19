package com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.api.MyApi
import com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.api.RetrofitInstance
import com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.model.Plant
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    val retrofitInstance: MyApi = RetrofitInstance.getInstance().create(MyApi::class.java)

    private val _result = MutableLiveData<List<Plant>>()
    val result : LiveData<List<Plant>>
     get() = _result

    fun getAllData() = viewModelScope.launch {
        _result.value = retrofitInstance.getAllPlants()
    }
}