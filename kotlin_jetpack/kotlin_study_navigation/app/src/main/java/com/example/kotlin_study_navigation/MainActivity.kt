package com.example.kotlin_study_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.btn1)

        val btn2: Button = findViewById(R.id.btn2)

        val manager = supportFragmentManager

        btn1.setOnClickListener {
            val area1 :LinearLayout = findViewById(R.id.area1)
            area1.visibility = View.VISIBLE
//            val transaction1 = manager.beginTransaction()
//            val fragment1 = BlankFragment1()
//            transaction1.replace(R.id.frameArea, fragment1)
//            transaction1.commit()
        }
        btn2.setOnClickListener {
            val area2 :LinearLayout = findViewById(R.id.area2)
            area2.visibility = View.VISIBLE
//            val transaction2 = manager.beginTransaction()
//            val fragment2 = BlankFragment2()
//            transaction2.replace(R.id.frameArea, fragment2)
//            transaction2.commit()
        }
    }

}