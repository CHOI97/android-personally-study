package com.example.kotlin_study_databinding_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.kotlin_study_databinding_2.databinding.ActivityMainBinding

// DataBinding
// 이름 그대로 Data 를 Binding 하는데 데이터를 처리 할 수 있을까?
// 데이터 결합
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    var testCount: Int = 20
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 기존의 방법
//        binding.test.text = "기존 방법"

        // 데이터 결합
        val person = Person("초이",testCount)
        binding.user = person // 데이터 결합 data -> variable -> name
    }
    fun myClick(view: View){
        Log.d("MainActivity","onClick")
        testCount ++

        // 데이터 결합
        val person = Person("초이",testCount)
        binding.user = person // 데이터 결합 data -> variable -> name
    }
}