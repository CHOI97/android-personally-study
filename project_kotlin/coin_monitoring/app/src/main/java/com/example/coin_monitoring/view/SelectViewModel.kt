package com.example.coin_monitoring.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coin_monitoring.repository.NetworkRepository
import kotlinx.coroutines.launch
import timber.log.Timber

class SelectViewModel: ViewModel() {

    private val newWorkRepository = NetworkRepository()
    fun getCurrentCoinList() = viewModelScope.launch {
        val result = newWorkRepository.getCurrentCoinList()
        Timber.d(result.toString())
    }

}