package com.example.kotlin_study_custom_dialog

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kotlin_study_custom_dialog.databinding.ActivitiySecondBinding

class SecondActivity: AppCompatActivity() {
    private lateinit var binding: ActivitiySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activitiy_second)
        binding.btnGoDefault.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}