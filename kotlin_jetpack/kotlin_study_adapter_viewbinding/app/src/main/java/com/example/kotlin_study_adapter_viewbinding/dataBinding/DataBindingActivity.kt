package com.example.kotlin_study_adapter_viewbinding.dataBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin_study_adapter_viewbinding.R
import com.example.kotlin_study_adapter_viewbinding.databinding.ActivityDataBindingBinding

class DataBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)

        val array =  ArrayList<String>()
        array.add("a")
        array.add("b")
        array.add("c")
        array.add("d")
        array.add("e")
        array.add("f")
        array.add("g")
        array.add("h")
        array.add("i")

        val customDataAdapter = CustomDataAdapter(array)
        val rv = binding.rv
        rv.adapter = customDataAdapter
        rv.layoutManager = LinearLayoutManager(this)
    }
}