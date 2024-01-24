package com.example.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.base.databinding.ItemProductBinding
import com.example.base.db.Favorite
import com.example.base.model.Product
import timber.log.Timber

class ProductListRVAdapter(private val dataList: List<Product>): RecyclerView.Adapter<ProductListRVAdapter.DataViewHolder>() {
    private var listener : OnClickInterface? = null
    interface OnClickInterface{
        fun onItemClick(v: View, product: Product, pos:Int)
        fun onFavoriteButtonClick(favorite: Favorite, pos: Int)
    }

    fun setOnItemClickListener(listener : OnClickInterface){
        this.listener = listener
    }
    inner class DataViewHolder(private val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            val product = dataList[position]
            binding.productModel = dataList[position]
            binding.ibFavorite.setOnClickListener {
                listener?.onFavoriteButtonClick( Favorite(product.name, product.description,product.thumbnail),position)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DataViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: DataViewHolder,
        position: Int
    ) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = dataList.size

    override fun getItemViewType(position: Int): Int {
        return position
    }
}