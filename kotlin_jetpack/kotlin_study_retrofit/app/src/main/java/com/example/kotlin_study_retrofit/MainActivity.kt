package com.example.kotlin_study_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_study_retrofit.adapter.CustomAdapter
import com.example.kotlin_study_retrofit.model.Post
import com.example.kotlin_study_retrofit.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getPost1()
        viewModel.getPostNumber(3)
        viewModel.getPostAll()
        val area1 = findViewById<TextView>(R.id.area1)
        val area2 = findViewById<TextView>(R.id.area2)

        viewModel.liveWord1.observe(this, Observer {
            area1.text = it
        })
        viewModel.liveWord2.observe(this, Observer {
            area2.text = it
        })

        val rv = findViewById<RecyclerView>(R.id.rv)
        viewModel.liveWordList.observe(this,Observer{
            val customAdapter = CustomAdapter(it as ArrayList<Post>)
            rv.adapter = customAdapter
            rv.layoutManager = LinearLayoutManager(this)
        })
    }
}
// Simple Retrofit Ex
// https://jsonplaceholder.typicode.com/posts
// Retrofit CallBack hell..
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val api = RetrofitInstance.getInstance().create(MyApi::class.java)
//
//        // API 호출이 순서대로 오는 것이 아닌 비동기적 실행
//        // CallBack Hell
//        // 가독성이 떨어짐
//        api.getPost1().enqueue(object: Callback<Post> {
//            // API 1
//            override fun onResponse(call: Call<Post>, response: Response<Post>) {
//                Log.d("API1",response.toString())
//                // API 2
//                api.getPostNumber(2).enqueue(object: Callback<Post> {
//                    override fun onResponse(call: Call<Post>, response: Response<Post>) {
//                        Log.d("API2",response.body().toString())
//                        // API 3
//                        api.getPostNumber(3).enqueue(object: Callback<Post> {
//                            override fun onResponse(call: Call<Post>, response: Response<Post>) {
//                                Log.d("API3",response.body().toString())
//                                // API 4
//                                api.getPostNumber(4).enqueue(object: Callback<Post> {
//                                    override fun onResponse(call: Call<Post>, response: Response<Post>) {
//                                        Log.d("API4",response.body().toString())
//                                    }
//
//                                    override fun onFailure(call: Call<Post>, t: Throwable) {
//                                        Log.d("API4","fail")
//                                    }
//                                })
//                            }
//
//                            override fun onFailure(call: Call<Post>, t: Throwable) {
//                                Log.d("API3","fail")
//                            }
//                        })
//                    }
//
//                    override fun onFailure(call: Call<Post>, t: Throwable) {
//                        Log.d("API2","fail")
//                    }
//                })
//            }
//
//            override fun onFailure(call: Call<Post>, t: Throwable) {
//                Log.d("API1","fail")
//            }
//        })
//
//
//
//
//    }
//}