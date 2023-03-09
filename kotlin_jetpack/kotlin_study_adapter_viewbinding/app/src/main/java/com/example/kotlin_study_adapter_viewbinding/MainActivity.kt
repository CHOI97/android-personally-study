package com.example.kotlin_study_adapter_viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// ViewBing DataBinding
// Recyclerview Adapter findViewById

// DataBinding + ViewModel + LiveData
// Simple DataBinding Recyclerview
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        val customAdapter = CustomAdapter(array)
        val rv = findViewById<RecyclerView>(R.id.rv)
        rv.adapter = customAdapter
        rv.layoutManager = LinearLayoutManager(this)

    }
}