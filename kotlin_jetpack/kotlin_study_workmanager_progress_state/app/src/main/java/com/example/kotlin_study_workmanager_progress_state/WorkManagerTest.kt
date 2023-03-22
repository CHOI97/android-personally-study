package com.example.kotlin_study_workmanager_progress_state

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import kotlinx.coroutines.delay

class WorkManagerTest(context: Context, params: WorkerParameters): CoroutineWorker(context, params) {
    companion object{
        const val HowMuch = "progress"
    }
    override suspend fun doWork(): Result {

        // i -> 1,2,3,4,5,6,7,8,9,10 -> 10% 20% 30% ... 100%
        for(i in 1..10){
            val result = workDataOf(HowMuch to i*10)
            setProgress(result)
            delay(1000)
        }

        return Result.success()
    }
}