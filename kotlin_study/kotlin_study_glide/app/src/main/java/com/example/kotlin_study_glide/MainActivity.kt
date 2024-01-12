package com.example.kotlin_study_glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.kotlin_study_glide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Glide.with(this).load("https://simya-s3-bucket.s3.ap-northeast-2.amazonaws.com/37a645bb-d658-4e6f-b9e9-d18d3737ac39.jpg").into(binding.ivProfile)
    }
}