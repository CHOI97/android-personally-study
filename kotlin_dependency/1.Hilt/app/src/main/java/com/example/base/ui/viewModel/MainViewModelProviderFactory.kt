package com.example.base.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.base.repository.ProductRepository

/*
* ViewModelFactory를 만들어 놓고 쓰지 않는 이유!
* Hilt에는 ViewModelFactory가 이미 내부에 정의가 되어있고, ActivityComponent, FragmentComponet에 자동으로 install 되어있다.*/
class MainViewModelProviderFactory(
    private val productRepository: ProductRepository,
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(productRepository) as T
        }
        throw IllegalArgumentException("ViewModel class not found")
    }
}