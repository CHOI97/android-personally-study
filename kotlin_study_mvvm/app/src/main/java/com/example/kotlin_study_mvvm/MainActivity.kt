package com.example.kotlin_study_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.kotlin_study_mvvm.databinding.ActivityMainBinding

class MainActivity(): AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewmodels()

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        setupObserver()
        setupClickListener()
    }

    private fun setupObserver(){
        mainViewModel.data.observe(this) {
            binding.textview.text = it
        }
    }

    private fun setupClickListener(){
        binding.button.setOnClickListener{
            mainViewModel.getData()
        }
    }

}