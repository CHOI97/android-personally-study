package com.example.base.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.base.R
import com.example.base.databinding.ActivityMainBinding
import com.example.base.ui.viewModel.MainViewModel
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

        binding.ibNext.setOnClickListener{
            val intent = Intent(this, ProductListActivity::class.java)
            startActivity(intent)
        }

    }

}