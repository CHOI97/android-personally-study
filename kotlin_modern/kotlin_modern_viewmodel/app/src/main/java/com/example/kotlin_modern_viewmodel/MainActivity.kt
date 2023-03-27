package com.example.kotlin_modern_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_modern_viewmodel.databinding.ActivityMainBinding

/*
    화면구성에 변화가 일어나면 onCreate() -> 재생성이 일어나면 Activity Data 가 모두 사라짐
    이러한 일들을 방지하기 위해 onSaveInstanceState Bundle 에 저장하여 값을 가져오도록 함
    Bundle 은 거대한 데이터를 다루지 못한다.
    -> ViewModel()  Activity 와는 독립된 LifeCycle 을 가지고 있음

    By 키워드 -> lazy 작업 위임

    Fragment , activityViewModels() 한 Activity 에서 viewModel 을 Fragment 를 공유할 때 사용
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        ViewModel Factory 가 필요한 이유
//        val myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
//        myViewModel.counter = 100
//
//        binding.tv.text = myViewModel.counter.toString()
//
//        binding.btn.setOnClickListener {
//            myViewModel.counter += 1
//            binding.tv.text = myViewModel.counter.toString()
//        }

        val factory = MyViewModelFactory(100, this)
        val myViewModel = ViewModelProvider(this, factory).get(MyViewModel::class.java)
        /*
            by 키워드를 통한 init
            val myViewModel by viewModels<MyViewModel>() { factory }
         */
        binding.tv.text = myViewModel.counter.toString()

        binding.btn.setOnClickListener {
            myViewModel.counter += 1
            binding.tv.text = myViewModel.counter.toString()
            // 값이 증가될 때마다 saveStateHandel 에 저장
            myViewModel.saveState()
        }
    }
}