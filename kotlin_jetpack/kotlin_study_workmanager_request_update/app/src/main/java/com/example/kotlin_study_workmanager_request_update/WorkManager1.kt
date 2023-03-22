package com.example.kotlin_study_workmanager_request_update

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.text.SimpleDateFormat
import java.util.*

class WorkManager1(context: Context,workerParameters: WorkerParameters)
    : Worker(context,workerParameters) {
    override fun doWork(): Result {
        Log.d("WorkManager1","doWork")
        val format = SimpleDateFormat("hh:mm:ss")
        val currentTime = format.format(Date())
        Log.d("WorkManager1",currentTime)
        return Result.success()
    }
}