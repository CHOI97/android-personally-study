package com.example.base.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.base.R
import com.example.base.databinding.ActivityMainBinding
import com.example.base.repository.ProductRepositoryImpl
import com.example.base.ui.viewModel.MainViewModel
import com.example.base.ui.viewModel.MainViewModelProviderFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/*
    Hilt?
    Android DI를 위한 Library
     기존 Dagger보다 사용하기 쉬우며, Dagger를 기반으로 만들어짐

    DI?
    Dependency Injection 의존성 주입
    간단하게 말해서 직접 생성 -> 전달 받아서 주입
    테스트에 용이하고 보일러 플레이트 코드 감소

    @AndroidEntryPoint
    해당 어노테이션은 Activity 안에 선언된 @Inject가 선언된 변수들을 위한 어노테이션
*/
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = viewModel
        binding.lifecycleOwner = this

        binding.btnLoad.setOnClickListener {
            if (binding.etNum.text.toString() != "") {
                viewModel.getPost(Integer.parseInt(binding.etNum.text.toString()))
            } else {
                Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
        }
    }
}