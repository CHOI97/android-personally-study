package com.example.kotlin_study_2way_databinding_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_study_2way_databinding_livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel : MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MyViewModel::class.java]
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

        binding.btn.setOnClickListener {
            viewModel.printAllData()
        }

    }
}