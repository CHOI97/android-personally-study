package com.example.base.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.base.R
import com.example.base.databinding.ActivityProductListBinding
import com.example.base.db.Favorite
import com.example.base.model.Product
import com.example.base.ui.adapter.ProductListRVAdapter
import com.example.base.ui.viewModel.ProductListViewModel
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class ProductListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductListBinding
    private val viewModel by viewModels<ProductListViewModel>()

    private lateinit var  productListAdapter : ProductListRVAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_product_list)
        binding.vm = viewModel
        binding.lifecycleOwner = this

        viewModel.getDataAll()
        viewModel.productList.observe(this){
            Timber.d("observer it size ${it.size}")
            productListAdapter = ProductListRVAdapter(it)
            binding.rvList.layoutManager = LinearLayoutManager(this)
            binding.rvList.adapter = productListAdapter
            productListAdapter.setOnItemClickListener(object: ProductListRVAdapter.OnClickInterface{
                override fun onItemClick(v: View, product: Product, pos: Int) {
                }

                override fun onFavoriteButtonClick(favorite: Favorite, pos: Int) {
                    viewModel.insertFavorite(favorite)
                }

            })
        }

        binding.ibNext.setOnClickListener {
            val intent = Intent(this,FavoriteListActivity::class.java)
            startActivity(intent)
        }


    }
}