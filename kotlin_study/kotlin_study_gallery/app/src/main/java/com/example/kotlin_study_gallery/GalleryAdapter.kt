package com.example.kotlin_study_gallery

import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlin_study_gallery.databinding.ItemGalleryBinding


class GalleryAdapter : RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>() {
    private var listener: OnItemClickListener? = null
    private val imageList = mutableListOf<Uri>()

    fun setImageList(list: List<Uri>) {
        imageList.addAll(list)
    }

    inner class GalleryViewHolder(private val binding: ItemGalleryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            Log.d("Binding Gallery","이미지 가져옴")
            val item = imageList[position]
            Glide.with(itemView)
                .load(item)
                .into(binding.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val binding = ItemGalleryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GalleryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        holder.bind(position)
        if(position != RecyclerView.NO_POSITION){
            holder.itemView.setOnClickListener{
                listener?.onItemClick(holder.itemView, imageList[position],position)
                Log.d("check position data",imageList[position].toString())
            }
        }
    }

    override fun getItemCount(): Int = imageList.size
    override fun getItemViewType(position: Int): Int {
        return position
    }
    interface OnItemClickListener {
        fun onItemClick(v: View, data: Uri, position: Int)
        fun onLongClick(v: View, data: Uri, position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener){
        this.listener = listener
    }
}