package com.example.base.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.base.R
import com.example.base.databinding.ActivityMainBinding
import com.example.base.ui.adapter.ProductListRecyclerviewAdapter
import com.example.base.ui.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    private var dataList = ArrayList<String>()
    private lateinit var  productListAdapter : ProductListRecyclerviewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = viewModel
        binding.lifecycleOwner = this

        // TestCode
        dummyTestData()

        binding.btnLoad.setOnClickListener {
            if (binding.etNum.text.toString() != "") {
                viewModel.getPost(Integer.parseInt(binding.etNum.text.toString()))
            } else {
                Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun dummyTestData(){
        dataList.add("hi1")
        dataList.add("hi2")
        dataList.add("hi3")
        dataList.add("hi4")
        dataList.add("hi5")
        dataList.add("hi6")
        dataList.add("hi7")
        dataList.add("hi8")
        dataList.add("hi9")
        dataList.add("hi10")
    }
}