package com.example.presentation.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.base.databinding.ItemFavoriteProductBinding
import com.example.base.db.Favorite
import com.example.base.model.Product
import timber.log.Timber

//class FavoriteListRVAdapter(private val dataList: List<Favorite>): RecyclerView.Adapter<FavoriteListRVAdapter.DataViewHolder>() {
//    private var listener: OnClickInterface? = null
//    interface OnClickInterface{
//        fun onItemClick(v: View, product: Product, pos:Int)
//        fun onDeleteButtonClick(favorite: Favorite, pos: Int)
//    }
//
//    fun setOnItemClickListener(listener : OnClickInterface){
//        this.listener = listener
//    }
//    inner class DataViewHolder(private val binding: ItemFavoriteProductBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//        fun bind(position: Int) {
//            binding.favoriteModel = dataList[position]
//            binding.ibFavorite.setOnClickListener {
//                listener?.onDeleteButtonClick(dataList[position],position)
//            }
//        }
//    }
//
//    override fun onCreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ): FavoriteListRVAdapter.DataViewHolder {
//        val binding = ItemFavoriteProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return DataViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: FavoriteListRVAdapter.DataViewHolder, position: Int) {
//        holder.bind(position)
//    }
//
//    override fun getItemCount(): Int = dataList.size
//
//    override fun getItemViewType(position: Int): Int {
//        return position
//    }
//}

class FavoriteListRVAdapter() : ListAdapter<Favorite, FavoriteListRVAdapter.ViewHolder>(
    DiffUtilCallback
) {

    var onItemClick: ((Favorite) -> Unit)? = null
    var onDeleteClick: ((Favorite) -> Unit)? = null

    inner class ViewHolder(private val binding: ItemFavoriteProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(favorite: Favorite) {
            binding.favoriteModel = favorite
            binding.ibFavorite.setOnClickListener {
                onDeleteClick?.invoke(favorite)
                Timber.d("ibFavorite")
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemFavoriteProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    companion object {
        val DiffUtilCallback = object : DiffUtil.ItemCallback<Favorite>() {
            override fun areContentsTheSame(oldItem: Favorite, newItem: Favorite) =
                oldItem == newItem

            override fun areItemsTheSame(oldItem: Favorite, newItem: Favorite) =
                oldItem.id == newItem.id
        }
    }
}

