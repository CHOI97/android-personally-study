package com.example.kotlin_study_extensions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
// findViewById -> val btn1 : Button = findViewById(R.id.btn1)
// Kotlin Extensions
// 성능이슈 생길 수 있음

// 대체
// ViewBinding
// DataBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// findViewById -> 100개라면?? 코드의 가독성이 떨어짐 / 직접 코드를 타이핑하는 과정도 너무 많아짐
//        val btn1 : Button = findViewById(R.id.btn1)
//        val btn2 : Button = findViewById(R.id.btn2)
//        val btn3 : Button = findViewById(R.id.btn3)
//
//        btn1.text = "abcd"
//        btn2.text = "abcd"
//        btn3.text = "abcd"

        // Kotlin Extensions
        btn1.text = "abcd"
        btn2.text = "abcd"
        btn3.text = "abcd"
        // ERROR!
        secondBtn.text = "second btn"


    }
}