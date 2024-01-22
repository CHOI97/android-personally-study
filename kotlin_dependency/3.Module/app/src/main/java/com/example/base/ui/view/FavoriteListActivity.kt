package com.example.base.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.example.base.R
import com.example.base.databinding.ActivityFavoriteListBinding
import com.example.base.db.Favorite
import com.example.base.model.Product
import com.example.base.ui.adapter.FavoriteListRVAdapter
import com.example.base.ui.adapter.ProductListRVAdapter
import com.example.base.ui.viewModel.FavoriteListViewModel
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class FavoriteListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavoriteListBinding
    private val viewModel by viewModels<FavoriteListViewModel>()


    private val favoriteListAdapter by lazy { FavoriteListRVAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_favorite_list)
        binding.vm = viewModel
        binding.lifecycleOwner = this

        setupRecyclerView()
        viewModel.getFavoriteList()
        observeFavoriteList()
    }
    private fun setupRecyclerView() {
        favoriteListAdapter.onDeleteClick = { favorite ->
            viewModel.deleteFavorite(favorite)
            Timber.d("onDeleteClick")
            Toast.makeText(this,"해당 항목이 삭제되었습니다",Toast.LENGTH_SHORT).show()
        }
        binding.rvFavorite.apply {
            layoutManager = LinearLayoutManager(this@FavoriteListActivity)
            adapter = favoriteListAdapter
        }


    }
    private fun observeFavoriteList() {
        viewModel.favoriteList.observe(this) { favorites ->
            Timber.d("observer it size ${favorites.size}")
            favoriteListAdapter.submitList(favorites)
        }
    }
}