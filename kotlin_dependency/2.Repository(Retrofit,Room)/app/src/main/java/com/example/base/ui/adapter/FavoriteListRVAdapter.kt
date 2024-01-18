package com.example.base.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import com.example.base.databinding.ItemFavoriteProductBinding
import com.example.base.db.Favorite
import com.example.base.model.Product
import timber.log.Timber

class FavoriteListRVAdapter(private val dataList: List<Favorite>): RecyclerView.Adapter<FavoriteListRVAdapter.DataViewHolder>() {
    private var listener: OnClickInterface? = null
    interface OnClickInterface{
        fun onItemClick(v: View, product: Product, pos:Int)
        fun onDeleteButtonClick(favorite: Favorite, pos: Int)
    }

    fun setOnItemClickListener(listener : OnClickInterface){
        this.listener = listener
    }
    inner class DataViewHolder(private val binding: ItemFavoriteProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.favoriteModel = dataList[position]
            binding.ibFavorite.setOnClickListener {
                listener?.onDeleteButtonClick(dataList[position],position)
            }
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