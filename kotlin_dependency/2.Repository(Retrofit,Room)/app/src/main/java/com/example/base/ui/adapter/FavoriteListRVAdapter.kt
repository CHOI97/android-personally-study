package com.example.base.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.base.databinding.ItemFavoriteProductBinding
import com.example.base.db.Favorite
import timber.log.Timber

class FavoriteListRVAdapter(private val dataList: List<Favorite>): RecyclerView.Adapter<FavoriteListRVAdapter.DataViewHolder>() {

    inner class DataViewHolder(private val binding: ItemFavoriteProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.favoriteModel = dataList[position]
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FavoriteListRVAdapter.DataViewHolder {
        val binding = ItemFavoriteProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavoriteListRVAdapter.DataViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = dataList.size

    override fun getItemViewType(position: Int): Int {
        return position
    }
}