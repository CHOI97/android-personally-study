package com.example.kotlin_study_adapter_viewbinding.viewBinding

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_study_adapter_viewbinding.CustomAdapter
import com.example.kotlin_study_adapter_viewbinding.R
import com.example.kotlin_study_adapter_viewbinding.databinding.TextRowItemBinding

class CustomViewAdapter (private val dataset: ArrayList<String>): RecyclerView.Adapter<CustomViewAdapter.ViewHolder>() {

    class ViewHolder(binding: TextRowItemBinding): RecyclerView.ViewHolder(binding.root){
        val myText = binding.myTextView
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = TextRowItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.myText.text = dataset[position]
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}