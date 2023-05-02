package com.example.kotlin_modern_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_modern_databinding.databinding.ActivityMainBinding

/*
    dataBinding
    선언적 형식의 UI 구성요소를 앱 데이터소스와 결합할 수 있는 지원 라이브러리리

     2Way dataBinding

 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)


        val myRepositoryImpl = MyRepositoryImpl(10)
        val factory  = MyViewModelFactory(10, myRepositoryImpl,this)
        val myViewModel = ViewModelProvider(this, factory)[MyViewModel::class.java]
        binding.lifecycleOwner = this
        binding.viewModel = myViewModel
        binding.btn.setOnClickListener {
            myViewModel.increaseCounter()
        }



    }
}