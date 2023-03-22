package com.example.kotlin_study_workmanager_chaining

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class WorkManagerB(context: Context, workerParameters: WorkerParameters): Worker(context,workerParameters) {
    override fun doWork(): Result {
        for (i in 1..3) {
            Thread.sleep(1000)
            Log.d("WorkManagerB", i.toString())
        }
        return Result.success()
    }
}
