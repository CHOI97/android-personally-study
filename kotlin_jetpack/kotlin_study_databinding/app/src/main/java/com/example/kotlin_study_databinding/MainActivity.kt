package com.example.kotlin_study_databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.kotlin_study_databinding.databinding.ActivityMainBinding

// DataBinding
// ViewBinding 이랑 뭐가 다른가?
// 이름처럼 데이터를 연결해주는 역할을 할 수 있다. (데이터와 같이 결합해서 사용할 수 있음)
// DataBinding + LiveData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.dataBindingEx.text = "바뀐 텍스트"
        binding.dataBindingEx.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}