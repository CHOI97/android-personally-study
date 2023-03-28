package com.example.kotlin_modern_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_modern_livedata.databinding.ActivityMainBinding

/*
    LiveData
    값의 변경을 감지할 수 있는 데이터, ViewModel 과 결합
    lifecycleOwner
    메모리 누수 없음
    중지된 활동으로 인한 비정상 종료 없음
    최신 데이터 유지
    적절한 구성변경 등..
    -> livedata 는 값을 변경할 수 없는 데이터
    -> 변경하려면 Transformations로 변경하기 ( map, switch map)

    Observer Pattern
    Subject 의 상태변화를 관찰하는 Observer 들을 객체와 연결
    Subject 의 상태변화를 Event가 발생하면 객체가 그 Event를 직접 Observer에 통지

    Observable
    lifecycle을 알 수 없음
    콜백등록해야함

 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val factory = MyViewModelFactory(100, this)
        val myViewModel = ViewModelProvider(this, factory).get(MyViewModel::class.java)

        binding.btn.setOnClickListener {
            myViewModel.saveState()
            myViewModel.liveCounter.value = myViewModel.liveCounter.value?.plus(1)
        }
        // 라이브 데이터 옵저빙
        myViewModel.liveCounter.observe(this){ counter ->
            binding.tv.text = counter.toString()
        }
        myViewModel.modifiedCounter.observe(this){ counter ->
            binding.tv.text = counter.toString()
        }

    }

}
