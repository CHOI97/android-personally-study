package com.example.base.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.base.R
import com.example.base.databinding.ActivityProductListBinding
import com.example.base.model.Product
import com.example.base.ui.adapter.ProductListRecyclerviewAdapter
import com.example.base.ui.viewModel.ProductListViewModel
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class ProductListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductListBinding
    private val viewModel:  ProductListViewModel by viewModels()
    private lateinit var  productListAdapter : ProductListRecyclerviewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_product_list)
        binding.vm = viewModel
        binding.lifecycleOwner = this


        viewModel.getDataAll()
        viewModel.productList.observe(this, Observer {
            Timber.d("observer it size ${it.size}")
            productListAdapter = ProductListRecyclerviewAdapter(it)
            binding.rvList.layoutManager = LinearLayoutManager(this)
            binding.rvList.adapter = productListAdapter
        })


    }
}