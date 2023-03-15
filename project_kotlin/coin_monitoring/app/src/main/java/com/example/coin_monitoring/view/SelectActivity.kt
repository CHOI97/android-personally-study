package com.example.coin_monitoring.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coin_monitoring.R
import com.example.coin_monitoring.databinding.ActivitySelectBinding
import com.example.coin_monitoring.view.adapter.SelectRVAdapter
import kotlinx.coroutines.selects.select
import timber.log.Timber

class SelectActivity : AppCompatActivity() {

    private val viewModel: SelectViewModel by viewModels()
    private lateinit var binding : ActivitySelectBinding
    private lateinit var selectRVAdapter: SelectRVAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.getCurrentCoinList()
        viewModel.currentPriceResult.observe(this , Observer{
            selectRVAdapter = SelectRVAdapter(this, it)
            binding.coinListRV.adapter = selectRVAdapter
            binding.coinListRV.layoutManager = LinearLayoutManager(this)
            Timber.d(it.toString())
        })

    }
}