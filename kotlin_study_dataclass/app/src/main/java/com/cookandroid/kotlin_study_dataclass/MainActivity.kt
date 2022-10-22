package com.cookandroid.kotlin_study_dataclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.cookandroid.kotlin_study_dataclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    private lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        user = User("60162188","최정현","컴퓨터공학과")
        viewBinding.userName.text = user.user_name
        var x = viewBinding.userName.text
        Log.d("text", x.toString())
        viewBinding.userId.text = user.user_id
        viewBinding.userData.text = user.user_data
    }
}