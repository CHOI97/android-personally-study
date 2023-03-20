package com.example.kotlin_study_room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        CoroutineScope(Dispatchers.IO).launch{
            db.textDao().insert(TextEntity(0,"asdf"))
            Log.d("MAINACTIVITY",db.textDao().getAllData().toString())

        }
    }
}