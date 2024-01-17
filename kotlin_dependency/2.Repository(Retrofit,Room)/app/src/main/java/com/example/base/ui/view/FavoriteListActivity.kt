package com.example.base.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.example.base.R
import com.example.base.databinding.ActivityFavoriteListBinding
import com.example.base.ui.adapter.FavoriteListRVAdapter
import com.example.base.ui.adapter.ProductListRVAdapter
import com.example.base.ui.viewModel.FavoriteListViewModel
import timber.log.Timber

class FavoriteListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavoriteListBinding
    private val viewModel by viewModels<FavoriteListViewModel>()


    private lateinit var  favoriteListAdapter : FavoriteListRVAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_favorite_list)
        binding.vm = viewModel
        binding.lifecycleOwner = this

        viewModel.getFavoriteList()

        viewModel.favoriteList.observe(this){
            Timber.d("observer it size ${it.size}")
            favoriteListAdapter = FavoriteListRVAdapter(it)
            binding.rvFavorite.layoutManager = LinearLayoutManager(this)
            binding.rvFavorite.adapter = favoriteListAdapter
        }


    }

}