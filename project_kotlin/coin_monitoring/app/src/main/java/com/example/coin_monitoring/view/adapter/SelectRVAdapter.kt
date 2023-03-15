package com.example.coin_monitoring.view.adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coin_monitoring.R
import com.example.coin_monitoring.dataModel.CurrentPriceResult

class SelectRVAdapter(val context: Context,val coinPriceList: List<CurrentPriceResult>)
    : RecyclerView.Adapter<SelectRVAdapter.ViewHolder>() {

        inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.intro_coin_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return coinPriceList.size
    }
}