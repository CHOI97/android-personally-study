package com.example.kotlin_study_viewmodel_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Activity ViewModel 화면 회전해도 데이터가 유지되도록
// Fragment 는 어떻게 될까?

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fragment ViewModel 을 위한 예외처리를 하는 방법도 있다.
        if(savedInstanceState == null){
            val transaction = manager.beginTransaction()
            val fragment = TestFragment()
            transaction.replace(R.id.frameArea,fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }
}