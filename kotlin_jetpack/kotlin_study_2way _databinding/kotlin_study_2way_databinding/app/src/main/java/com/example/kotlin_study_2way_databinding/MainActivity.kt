package com.example.kotlin_study_2way_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

// 양방향 데이터 결합 ( Two - Way Binding )
// 데이터와 뷰를 직접 연결해서 서로와 서로에게 영향을 주는 것

// 1. 기존 방식 -> Activity 에서 View와 연결해서 사용하는 방법
// 2. 양방향 데이터 결합 방식 -> ViewModel <-> Activity <-> XML
//                       -> ViewModel <-> XML

// 1번방식 코드
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age = 0

        val ageArea = findViewById<TextView>(R.id.ageArea)
        val plusBtn = findViewById<Button>(R.id.plusBtn)

        plusBtn.setOnClickListener{
            age++
            ageArea.text= age.toString()
        }

    }

}