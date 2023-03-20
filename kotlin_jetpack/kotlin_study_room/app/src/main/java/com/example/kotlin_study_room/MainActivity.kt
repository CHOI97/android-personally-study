package com.example.kotlin_study_room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_study_room.adapter.CustomAdapter
import com.example.kotlin_study_room.db.TextDatabase
import com.example.kotlin_study_room.entity.TextEntity
import com.example.kotlin_study_room.entity.WordEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// ROOM
// Entity, DAO

class MainActivity : AppCompatActivity() {

    lateinit var viewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getData()

        val db = TextDatabase.getDatabase(this)

        val inputArea = findViewById<EditText>(R.id.textInputArea)
        val insertBtn = findViewById<Button>(R.id.insert)
        val getAllBtn = findViewById<Button>(R.id.getData)
        val deleteBtn = findViewById<Button>(R.id.delete)
        /*
         Dispatchers 배차원, 발차원, 조차원 ? Thread 를 배치하고 관리한다.
         Coroutine -> Android Thread 를 사용
         Dispatchers.Main , Dispatchers.IO , Dispatchers.Default
         Dispatchers.IO 외부 디스크 또는 네트워크 I/O , ROOM 구성요소를 사용
        */
        insertBtn.setOnClickListener {

            viewModel.insertData(inputArea.text.toString())
            inputArea.setText("")
//            CoroutineScope(Dispatchers.IO).launch{
//                db.textDao().insert(TextEntity(0,inputArea.text.toString()))
//                db.wordDao().insert(WordEntity(0,inputArea.text.toString()))
//                Log.d("MAINACTIVITY",db.textDao().getAllData().toString())
//
//                inputArea.setText("")
//            }
        }

        val rv = findViewById<RecyclerView>(R.id.rv)

        viewModel.textList.observe(this, Observer{
            val customAdapter = CustomAdapter(it)
            rv.adapter = customAdapter
            rv.layoutManager = LinearLayoutManager(this)
        })
        getAllBtn.setOnClickListener {
            viewModel.getData()
//            CoroutineScope(Dispatchers.IO).launch {
//                Log.d("MAINACTIVITY", db.textDao().getAllData().toString())
//                Log.d("MAINACTIVITY", db.wordDao().getAllData().toString())
//            }
        }
        deleteBtn.setOnClickListener {
            viewModel.removeData()
//            CoroutineScope(Dispatchers.IO).launch {
//                db.textDao().deleteAllData()
//                db.wordDao().deleteAllData()
//            }
        }
    }
}