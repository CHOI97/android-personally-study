package com.example.kotlin_study_sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var db : SQLiteHelperSample
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = SQLiteHelperSample(this)
        val inputArea = findViewById<EditText>(R.id.inputArea)
        val insertBtn = findViewById<Button>(R.id.insert)
        val getAllBtn = findViewById<Button>(R.id.getAll)
        val deleteBtn = findViewById<Button>(R.id.deleteAll)
        val resultBtn = findViewById<TextView>(R.id.resultArea)

        insertBtn.setOnClickListener {
            val inputText = inputArea.text.toString()
            db.insert(inputText)
            inputArea.setText("")
        }
        getAllBtn.setOnClickListener {
            val arr = db.getAllData()
            resultBtn.text = arr.toString()
        }
        deleteBtn.setOnClickListener {
            db.deleteAll()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        db.close()
    }
}