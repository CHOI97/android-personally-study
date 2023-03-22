package com.example.kotlin_study_workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.work.Data
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf

// Background Task, Coroutine, Task Sequence Setting

// WorkManager 데이터 주고, 받기

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        SimpleThread().start()

//        val workManagerA = OneTimeWorkRequestBuilder<WorkManagerA>().build()
//        WorkManager.getInstance(this).enqueue(workManagerA)

        val myData : Data = workDataOf(
            "a" to 10,
            "b" to 20
        )

        val workManagerB = OneTimeWorkRequestBuilder<WorkManagerB>().setInputData(myData).build()
        WorkManager.getInstance(this).enqueue(workManagerB)
        WorkManager.getInstance(this).getWorkInfoByIdLiveData(workManagerB.id)
            .observe(this, Observer{ info ->
                if(info != null && info.state.isFinished){
                    val result = info.outputData.getInt("result",100000)
                    val result2 = info.outputData.getInt("result2",100000)
                    Log.d("MainActivity",result.toString())
                    Log.d("MainActivity",result2.toString())
                }
            })
    }
}

//class SimpleThread: Thread(){
//    override fun run() {
//        super.run()
//
//        for(i in 1..10){
//            Log.d("MainActivity","$i")
//            sleep(1000)
//        }
//    }
//}