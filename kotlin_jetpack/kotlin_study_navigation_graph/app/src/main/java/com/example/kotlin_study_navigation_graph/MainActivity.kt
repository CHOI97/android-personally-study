package com.example.kotlin_study_navigation_graph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Fragment 1 -> 2 -> 3 -> 4 -> 5 ... Back Button ? -> 5 -> 4 -> 3 -> 2 -> 1 ? / 5 -> 1 ?
// 1. Fragment onBackPressed call back 사용해서 돌아오기 (하지만 뷰 스택이 쌓여서 뒤로가기를 누르면 다시 5번)
// 2. app:popUpTo="@id/blankFragment1"
//
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}