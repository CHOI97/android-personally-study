package com.example.kotlin_study_databinding_bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_study_databinding_bindingadapter.databinding.ActivityMainBinding

// 양방향 데이터 결합( Two - Way Binding)
// BindingAdapter -> View 에 속성을 내 마음대로 수정
// 1. 기존에 양방향 데이터 결합 / BindingAdapter 사용하지 않고 제작
// 2. 양방향 데티터 결합 / BindingAdapter를 사용해서 제작
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
//        var age = 0
//        val ageArea = findViewById<TextView>(R.id.ageArea)
//        val imgArea = findViewById<ImageView>(R.id.imgArea)
//        val plus = findViewById<Button>(R.id.plus)
//
//        plus.setOnClickListener {
//            age ++
//            ageArea.text = age.toString()
//            if(age>20){
//                imgArea.setImageResource(R.drawable.choi)
//            }
//        }
    }
}