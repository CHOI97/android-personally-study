package com.cookandroid.kotlin_study_intent_flag_exiting_previousactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cookandroid.kotlin_study_intent_flag_exiting_previousactivity.databinding.ActivityFourthBinding

class FourthActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding =  ActivityFourthBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}