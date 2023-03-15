package com.example.coin_monitoring.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coin_monitoring.dataModel.CurrentPrice
import com.example.coin_monitoring.dataModel.CurrentPriceResult
import com.example.coin_monitoring.network.model.CurrentPriceList
import com.example.coin_monitoring.repository.NetworkRepository
import com.google.gson.Gson
import kotlinx.coroutines.launch
import timber.log.Timber

class SelectViewModel: ViewModel() {

    private val newWorkRepository = NetworkRepository()

    private lateinit var currentPriceResultList: ArrayList<CurrentPriceResult>
    fun getCurrentCoinList() = viewModelScope.launch {
        val result = newWorkRepository.getCurrentCoinList()
        currentPriceResultList = ArrayList()

        try{
            for (coin in result.data){
                val gson = Gson()
                val gsonToJson = gson.toJson(result.data.get(coin.key))
                val gsonFromJson = gson.fromJson(gsonToJson, CurrentPrice::class.java)
                val currentPriceResult = CurrentPriceResult(coin.key,gsonFromJson)
                Timber.d(currentPriceResult.toString())
            }
        }catch (e: java.lang.Exception){
            Timber.d(e.toString())
        }

    }

}