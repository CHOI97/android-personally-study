package com.example.base.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.base.repository.ProductRepository

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