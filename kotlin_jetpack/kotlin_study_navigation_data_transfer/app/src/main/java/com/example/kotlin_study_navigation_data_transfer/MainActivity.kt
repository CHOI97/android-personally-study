package com.example.kotlin_study_navigation_data_transfer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// 첫번째 A / 두번째 B
// enterAnim -> A -> B 갈 때 B가 보이는 방식
// exitAnim -> A -> B 갈 때 A가 사라지는 방식
// popEnterAnim -> 뒤로가기 B -> A가 나타나는 방식
// popExitAnim -> 뒤로가기 B -> A
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}