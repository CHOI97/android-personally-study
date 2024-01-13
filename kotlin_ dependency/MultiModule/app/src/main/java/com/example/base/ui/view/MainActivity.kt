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