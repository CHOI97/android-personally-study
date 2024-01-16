package com.example.base.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.base.model.Product
import com.example.base.model.ProductResponse
import com.example.base.repository.network.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class ProductListViewModel @Inject constructor(
    private val productRepository: ProductRepository
) : ViewModel() {

    private val _productList = MutableLiveData<List<Product>>()
    val productList: LiveData<List<Product>> get() = _productList

    fun getDataAll() = viewModelScope.launch(Dispatchers.IO) {
        Timber.d("getDataAll")
        val response = productRepository.getPostAll()
        if (response.isSuccessful) {
            Timber.d("Test: ${response.body()}")
            val products = response.body()?.productList?.map{it.toProduct()}
            _productList.postValue(products ?: listOf())
            Timber.d("데이터 불러 오기 성공 ${_productList.value}")
            Timber.d("데이터 불러 오기 성공 ${productList.value}")
            Timber.d("데이터 불러 오기 성공 ${_productList.value?.size}")
            Timber.d("데이터 불러 오기 성공 ${productList.value?.size}")
        } else {
            Timber.d("데이터 불러 오기 실패")
        }
    }

    private fun ProductResponse.toProduct(): Product {
        return Product(
            id = this.id,
            name = this.title,
            description = this.description,
            thumbnail = this.thumbnail
        )
    }
}