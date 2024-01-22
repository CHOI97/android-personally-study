package com.example.base.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.base.repository.network.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val productRepository: ProductRepository
): ViewModel() {

    private var _image = MutableLiveData<String>("image")
    val image: LiveData<String>
        get() = _image

    private var _title = MutableLiveData<String>("title")
    val title: LiveData<String>
        get() = _title

    private var _description = MutableLiveData<String>("body")
    val description: LiveData<String>
        get() = _description

    private var _input = MutableLiveData<String>()
    val input: LiveData<String>
        get()=_input


    fun getPost(number: Int) = viewModelScope.launch{
        val response = productRepository.getPost(number)
        if(response.isSuccessful){
            response .body()?.let{body->
                _title.postValue(body.title)
                _image.postValue(body.thumbnail)
                _description.postValue(body.description)
            }
        }else{
            when(response.code()){
                404 -> {
                    _title.postValue("ERROR 404")
                    _image.postValue("null")
                    _description.postValue("존재하지 않는 데이터입니다.")
                }
            }
            Timber.d("Response failure")
        }
    }
}