package com.example.base.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.base.databinding.ItemProductBinding
import com.example.base.model.Product
import timber.log.Timber

class ProductListRecyclerviewAdapter(private val dataList: List<Product>): RecyclerView.Adapter<ProductListRecyclerviewAdapter.DataViewHolder>() {

    inner class DataViewHolder(private val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            Timber.d("bind")
            binding.productModel = dataList[position]
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductListRecyclerviewAdapter.DataViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ProductListRecyclerviewAdapter.DataViewHolder,
        position: Int
    ) {
        Timber.d("position: $position")
        holder.bind(position)
    }

    override fun getItemCount(): Int = dataList.size

    override fun getItemViewType(position: Int): Int {
        return position
    }
}