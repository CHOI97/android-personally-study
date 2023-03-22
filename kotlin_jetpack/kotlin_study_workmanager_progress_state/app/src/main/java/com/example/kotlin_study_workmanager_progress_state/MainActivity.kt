package com.example.kotlin_study_workmanager_progress_state

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkInfo
import androidx.work.WorkManager
import com.example.kotlin_study_workmanager_progress_state.WorkManagerTest.Companion.HowMuch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workManagerTest = OneTimeWorkRequestBuilder<WorkManagerTest>().build()
        WorkManager.getInstance(this).enqueue(workManagerTest)

        WorkManager.getInstance(this)
            .getWorkInfoByIdLiveData(workManagerTest.id)
            .observe(this, Observer{ workInfo : WorkInfo? ->
                val progress =workInfo?.progress
                val value = progress?.getInt(HowMuch,0)
                if(value != 0){
                    // Log test to Percent
                    Log.d("MainActivity",value.toString()+"%")
                }
                if(value == 100){
                    Log.d("MainActivity","WorkManager END")
                }
            })
    }
}