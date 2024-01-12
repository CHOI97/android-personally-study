package com.cookandroid.kotlin_study_intent_flag_exiting_previousactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cookandroid.kotlin_study_intent_flag_exiting_previousactivity.databinding.ActivityFourthBinding
import com.cookandroid.kotlin_study_intent_flag_exiting_previousactivity.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.btnThird.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            //Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK 이전 Activity 전부 지울경우
            startActivity(intent)
        }
    }
}