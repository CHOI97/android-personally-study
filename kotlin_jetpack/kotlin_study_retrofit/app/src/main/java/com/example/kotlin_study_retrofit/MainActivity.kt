package com.example.kotlin_study_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// Simple Retrofit Ex
// https://jsonplaceholder.typicode.com/posts
// Retrofit CallBack hell..
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api = RetrofitInstance.getInstance().create(MyApi::class.java)

        // API 호출이 순서대로 오는 것이 아닌 비동기적 실행
        // CallBack Hell
        // 가독성이 떨어짐
        api.getPost1().enqueue(object: Callback<Post> {
            // API 1
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                Log.d("API1",response.toString())
                // API 2
                api.getPostNumber(2).enqueue(object: Callback<Post> {
                    override fun onResponse(call: Call<Post>, response: Response<Post>) {
                        Log.d("API2",response.body().toString())
                        // API 3
                        api.getPostNumber(3).enqueue(object: Callback<Post> {
                            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                                Log.d("API3",response.body().toString())
                                // API 4
                                api.getPostNumber(4).enqueue(object: Callback<Post> {
                                    override fun onResponse(call: Call<Post>, response: Response<Post>) {
                                        Log.d("API4",response.body().toString())
                                    }

                                    override fun onFailure(call: Call<Post>, t: Throwable) {
                                        Log.d("API4","fail")
                                    }
                                })
                            }

                            override fun onFailure(call: Call<Post>, t: Throwable) {
                                Log.d("API3","fail")
                            }
                        })
                    }

                    override fun onFailure(call: Call<Post>, t: Throwable) {
                        Log.d("API2","fail")
                    }
                })
            }

            override fun onFailure(call: Call<Post>, t: Throwable) {
                Log.d("API1","fail")
            }
        })




    }
}