package com.example.kotlin_study_diffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// DiffUtil / ListAdapter
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.catRV)

        val adapter = CatListAdapter()

        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)

        adapter.submitList(firstSetupData())

        Handler(Looper.getMainLooper()).postDelayed({
            adapter.submitList(secondSetupData())
        }, 3000)

    }

    fun firstSetupData() : ArrayList<CatDataModel> {

        val cat1 = CatDataModel(1, "cat1", 10)
        val cat2 = CatDataModel(2, "cat2", 11)
        val cat3 = CatDataModel(3, "cat3", 12)
        val cat4 = CatDataModel(4, "cat4", 13)
        val cat5 = CatDataModel(5, "cat5", 14)

        val arr1 = ArrayList<CatDataModel>()

        arr1.add(cat1)
        arr1.add(cat2)
        arr1.add(cat3)
        arr1.add(cat4)
        arr1.add(cat5)

        return arr1

    }

    fun secondSetupData() : ArrayList<CatDataModel> {

        val cat3 = CatDataModel(3, "cat3", 12)
        val cat4 = CatDataModel(4, "cat4", 13)
        val cat5 = CatDataModel(5, "cat5", 14)
        val cat6 = CatDataModel(6, "cat6", 15)
        val cat7 = CatDataModel(7, "cat7", 16)
        val cat8 = CatDataModel(8, "cat8", 17)

        val arr2 = ArrayList<CatDataModel>()

        arr2.add(cat3)
        arr2.add(cat4)
        arr2.add(cat5)
        arr2.add(cat6)
        arr2.add(cat7)
        arr2.add(cat8)

        return arr2
    }

}