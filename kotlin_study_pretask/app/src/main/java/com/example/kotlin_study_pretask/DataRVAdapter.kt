package com.example.kotlin_study_pretask

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_study_pretask.databinding.ItemDataBinding

class DataRVAdapter(private val dataList:ArrayList<Data>): RecyclerView.Adapter<DataRVAdapter.DataViewHolder>() {

    // ViewHolder 객체
    inner class DataViewHolder(private val viewBinding: ItemDataBinding):RecyclerView.ViewHolder(viewBinding.root){
        fun bind(data: Data,position: Int){
            Log.d("this status","bind")
            viewBinding.textviewTitle.text = data.title
            viewBinding.textviewDesc.text = data.charge.toString()
        }


    }
    //ViewHolder 만들어 질때 실행할 동작
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        Log.d("this status","onCreateViewHolder")
        val viewBinding = ItemDataBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DataViewHolder(viewBinding)
    }
    // ViewHolder가 실제로 데이터를 표시해야 할 때 호출되는 함수 , 데이터를 표시할때마다 호출
    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        Log.d("this status","onBindViewHolder.....position is $position")
        holder.bind(dataList[position],position)
    }
    override fun getItemViewType(position: Int): Int {
        return position
    }
    // 표현할 Item의 총 개수
    override fun getItemCount(): Int= dataList.size

}