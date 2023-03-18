package com.example.kotlin_study_coroutine_viewmodelscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// 간단한 코루틴 , ViewModelScope
// 비동기적 코드를 생산성을 향상 시킬 수 있다.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var goToSecond = findViewById<Button>(R.id.go_to_second)
        goToSecond.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
//        Log.d("Test","START")
//        CoroutineScope(Dispatchers.IO).launch {
//            Log.d("Test","CoroutineScope START")
//            a()
//            b()
//            Log.d("Test","CoroutineScope END")
//        }
//        Log.d("Test","END")
        // ex) START -> END -> AP1 -> BP1 -> AP2 -> BP2
    }

    // suspend : 유예하다
    // 비동기 작업을 유예하다??
    //
    suspend fun a(){

        delay(1000)
        Log.d("Test","AP1")

        delay(1000)
        Log.d("Test","AP2")

    }
    suspend fun b(){

        delay(1000)
        Log.d("Test","BP1")

        delay(1000)
        Log.d("Test","BP2")

    }
}