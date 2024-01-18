package com.example.base.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
            favoriteListAdapter.setOnItemClickListener(object: FavoriteListRVAdapter.OnClickInterface{
                override fun onItemClick(v: View, product: Product, pos: Int) {
                }

                override fun onDeleteButtonClick(favorite: Favorite, pos: Int) {
                    viewModel.deleteFavorite(favorite)
                }

            })
        }
    }


}