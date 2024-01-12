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

        //dataclass 생성자
        user = User("26세 남자","최정현","컴퓨터공학과")


        //User라는 객체에 멤버
        viewBinding.userName.text = user.user_name
        viewBinding.userId.text = user.user_id
        viewBinding.userData.text = user.user_data
        Log.d("User라는 객체에 메소드",user.helloUser(user.user_name))

        //dataclass copy
        val second_user = user.copy(user_id="0000")
        Log.d("copy after dataclass",user.toString())
        Log.d("copy after dataclass copy",second_user.toString())
    }
}