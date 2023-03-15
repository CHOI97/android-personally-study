package com.example.coin_monitoring.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.coin_monitoring.R
import timber.log.Timber

class SelectActivity : AppCompatActivity() {

    private val viewModel: SelectViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)
        viewModel.getCurrentCoinList()
        viewModel.currentPriceResult.observe(this , Observer{
            Timber.d(it.toString())
        })

    }
}