package com.example.kotlin_study_workmanager_unique

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager

// WorkManager 고유 작업

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testBtn = findViewById<Button>(R.id.testBtn)
        testBtn.setOnClickListener {

            // 기존 방식 -> 다중 클릭시 여러개의 WorkManager 가 실행된다.
            val testWorkManager = OneTimeWorkRequestBuilder<TestWorkManager>().build()
            //WorkManager.getInstance(this).enqueue(testWorkManager)
            // 새로운 방식 (고유 작업)
            WorkManager.getInstance(this).enqueueUniqueWork("test",ExistingWorkPolicy.REPLACE,testWorkManager)
            // KEEP -> Unique 작업만 계속해서 실행된다.
            // REPLACE -> Unique 작업을 다른 작업으로 바꾼다.
        }
    }
}