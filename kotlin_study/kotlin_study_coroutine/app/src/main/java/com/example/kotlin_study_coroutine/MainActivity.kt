package com.example.kotlin_study_coroutine

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.example.kotlin_study_coroutine.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        /* lifecycleScope Thread 를 구분 Main(UI Thread) , Dispatcher Thread
        lifecycleScope.launch(Dispatchers.IO){
            delay(3000)
            Log.d(TAG, "coroutine 1 : ${Thread.currentThread().name}") // main 이 아닌 thread (DefaultDispatcher-worker-3)
            withContext(Dispatchers.Main){
                Log.d(TAG, "coroutine 2 : ${Thread.currentThread().name}") // UI 변경을 위한 비동기 처리 (main Thread)
            }
        }
        */
        /*
        lifecycleScope.launch{
            myFunc()
        }
        */
        lifecycleScope.launch(Dispatchers.IO){
            val time = measureTimeMillis {
                val result1 = async{network1()}
                val result2 = async{network2()}
                Log.d(TAG,"결과1: ${result1.await()}")
                Log.d(TAG,"결과2: ${result2.await()}")
            }
            Log.d(TAG,"시간 : $time")
        }

    }
    suspend fun network1(): String{
        delay(2000) // delay -> suspend 키워드를 꼭 붙여야한다. suspend 는 정지함수
        return "result network1"
    }
    suspend fun network2(): String{
        delay(3000) // delay -> suspend 키워드를 꼭 붙여야한다. suspend 는 정지함수
        return "result network2"
    }
    /*
    suspend fun myFunc(): String{
        delay(3000) // delay -> suspend 키워드를 꼭 붙여야한다. suspend 는 정지함수
        return "Hello"
    }
    */
}