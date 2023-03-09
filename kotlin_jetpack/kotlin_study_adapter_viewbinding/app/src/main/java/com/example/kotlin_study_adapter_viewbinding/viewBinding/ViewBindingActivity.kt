package com.example.kotlin_study_adapter_viewbinding.viewBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_study_adapter_viewbinding.CustomAdapter
import com.example.kotlin_study_adapter_viewbinding.R
import com.example.kotlin_study_adapter_viewbinding.databinding.ActivityMainBinding
import com.example.kotlin_study_adapter_viewbinding.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

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

        val customViewAdapter = CustomViewAdapter(array)
        val rv = binding.rv
        rv.adapter = customViewAdapter
        rv.layoutManager = LinearLayoutManager(this)

    }
}