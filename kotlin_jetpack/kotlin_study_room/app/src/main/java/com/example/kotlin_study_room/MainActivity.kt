package com.example.kotlin_study_room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.kotlin_study_room.db.TextDatabase
import com.example.kotlin_study_room.entity.TextEntity
import com.example.kotlin_study_room.entity.WordEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// ROOM
// Entity, DAO

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
            CoroutineScope(Dispatchers.IO).launch{
                db.textDao().insert(TextEntity(0,"asdf"))
                db.wordDao().insert(WordEntity(0,"asdf"))
                Log.d("MAINACTIVITY",db.textDao().getAllData().toString())

                inputArea.setText("")
            }
        }
        getAllBtn.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                Log.d("MAINACTIVITY", db.textDao().getAllData().toString())
                Log.d("MAINACTIVITY", db.wordDao().getAllData().toString())
            }
        }
        deleteBtn.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                db.textDao().deleteAllData()
                db.wordDao().deleteAllData()
            }
        }
    }
}