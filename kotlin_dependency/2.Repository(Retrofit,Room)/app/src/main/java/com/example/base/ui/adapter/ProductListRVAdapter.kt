package com.example.base.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.base.databinding.ItemProductBinding
import com.example.base.model.Product
import timber.log.Timber

class ProductListRVAdapter(private val dataList: List<Product>): RecyclerView.Adapter<ProductListRVAdapter.DataViewHolder>() {
    private var onItemClickListener: ((Product) -> Unit)? = null
    fun setOnItemClickListener(listener: (Product)->Unit){
        onItemClickListener = listener
    }
    inner class DataViewHolder(private val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.productModel = dataList[position]
            binding.ibFavorite.setOnClickListener {
                Timber.d("$position")
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductListRVAdapter.DataViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ProductListRVAdapter.DataViewHolder,
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