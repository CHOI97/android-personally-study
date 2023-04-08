package com.example.kotlin_modern_kakao_book_api.worker

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

class CacheDeleteWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParams: WorkerParameters,
    private val cacheDeleteResult: String
) : Worker(context, workerParams) {
    override fun doWork(): Result {
        return try {
//            Log.d("WorkManager", "Cache has successfully deleted")
            Log.d("WorkManager", cacheDeleteResult)
            Result.success()
        } catch (exception: Exception) {
            exception.printStackTrace()
            Result.failure()
        }
    }
}