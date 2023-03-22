package com.example.kotlin_study_workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager

// Background Task, Coroutine, Task Sequence Setting

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SimpleThread().start()

        val workManagerA = OneTimeWorkRequestBuilder<WorkManagerA>().build()
        WorkManager.getInstance(this).enqueue(workManagerA)
    }
}

class SimpleThread: Thread(){
    override fun run() {
        super.run()

        for(i in 1..10){
            Log.d("MainActivity","$i")
            sleep(1000)
        }
    }
}