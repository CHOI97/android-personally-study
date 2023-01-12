package com.example.kotlin_study_pretask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin_study_pretask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        // MybookActivity로 이동
        viewBinding.imagebuttonGotoLike.setOnClickListener{
            val intent = Intent(this,MyBookActivity::class.java)
            startActivity(intent)
        }

//        val dataList: ArrayList<Data> = arrayListOf()
//        val dataRVAdapter = DataRVAdapter(dataList)
//        dataList.apply{
//            add(Data("hello","1"))
//        }
//        viewBinding.recyclerviewMain.adapter = dataRVAdapter
//        viewBinding.recyclerviewMain.layoutManager = LinearLayoutManager(this)

    }
}