package com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.api.MyApi
import com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.api.RetrofitInstance
import com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.model.Plant
import com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.repository.Repository
import kotlinx.coroutines.launch

/*
     ***  Android Architecture ***
           Activity / Fragment
              ViewModel
             Repository
 Model(Room) / Remote Data Source(Retrofit)
*/
//https://vagabond95.me/posts/android-repository-pattern/

class MainViewModel: ViewModel() {

//    val retrofitInstance: MyApi = RetrofitInstance.getInstance().create(MyApi::class.java)
    private val repository = Repository()

    private val _result = MutableLiveData<List<Plant>>()
    val result : LiveData<List<Plant>>
     get() = _result

    fun getAllData() = viewModelScope.launch {
        _result.value = repository.getAllData()
    }
}