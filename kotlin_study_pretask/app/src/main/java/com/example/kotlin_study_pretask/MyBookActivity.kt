package com.example.kotlin_study_pretask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_study_pretask.databinding.ActivityMybookBinding

class MyBookActivity  : AppCompatActivity() {
    lateinit var viewBinding: ActivityMybookBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMybookBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}