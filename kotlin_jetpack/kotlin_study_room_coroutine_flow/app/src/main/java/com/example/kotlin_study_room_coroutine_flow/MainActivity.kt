package com.example.kotlin_study_room_coroutine_flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.kotlin_study_room_coroutine_flow.db.TextDatabase
import com.example.kotlin_study_room_coroutine_flow.db.TextEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

// Room + Coroutine Flow
// changes database observable read (Flow)
// 1. Flow를 사용하지 않을 때
// 2. Flow를 사용했을 때

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputArea = findViewById<EditText>(R.id.textInputArea)
        val insertBtn = findViewById<Button>(R.id.insert)
        val getAllBtn = findViewById<Button>(R.id.getData)
        val deleteBtn = findViewById<Button>(R.id.delete)

        val db = TextDatabase.getDatabase(this)

        val resultArea = findViewById<TextView>(R.id.resultArea)
        // Database 접근은 메인 Thread에서 하지 않는다.
        // 시간이 오래 걸릴 수 있으므로 앱이 멈추거나 종료된다.
        insertBtn.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                val text = TextEntity(0,inputArea.text.toString())
                db.textDao().insert(text)
                inputArea.setText("")
            }
        }
//        getAllBtn.setOnClickListener {
//            CoroutineScope(Dispatchers.IO).launch {
//                val resultText = db.textDao().getAllData().toString()
//                withContext(Dispatchers.Main){
//                    resultArea.text = resultText
//                }
//            }
//        }
        CoroutineScope(Dispatchers.IO).launch{
            db.textDao().getAllDataFlow().collect{
                var resultText = it.toString()
                withContext(Dispatchers.Main){
                    resultArea.text = resultText
                }
            }
        }
        deleteBtn.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                db.textDao().deleteAllData()
            }
        }
    }
}