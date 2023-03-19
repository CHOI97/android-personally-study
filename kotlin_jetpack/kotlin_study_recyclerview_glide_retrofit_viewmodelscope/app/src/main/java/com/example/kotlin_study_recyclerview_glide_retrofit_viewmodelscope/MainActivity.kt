package com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.adapter.CustomAdapter
import com.example.kotlin_study_recyclerview_glide_retrofit_viewmodelscope.viewModel.MainViewModel

//
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getAllData()

        val rv = findViewById<RecyclerView>(R.id.rv)
        viewModel.result.observe(this, Observer{
            val customAdapter = CustomAdapter(this ,it)
            rv.adapter = customAdapter
            rv.layoutManager = LinearLayoutManager(this)

        })
    }
}