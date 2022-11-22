package com.cookandroid.kotlin_study_sharedpreference

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.cookandroid.kotlin_study_sharedpreference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewBinding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
        val roomDb = AppDatabase.getInstance(this)

        if(roomDb!=null){
            val user = User("강아지",26)
            roomDb.userDao().insert(user)

            val userList = roomDb.userDao().selectAll()
            Log.d("userList",userList.toString())
        }






//        ********** SharedPreference **********
//
//        val sharedPrefs = getSharedPreferences("sharedprefs", Context.MODE_PRIVATE)
//        val editor = sharedPrefs.edit()
//
//        //이 코드는 무시(초기화용)
//        editor.putString("choi97","")
//        editor.apply()
//        //이 코드는 무시(초기화용)
//        // key value 값
//        editor.putString("choi97","android")
//        val before_sp_value = sharedPrefs.getString("choi97","null")
//        Log.d("Before_SP","${before_sp_value}")
//
//        editor.apply()
//
//        val sp_value = sharedPrefs.getString("choi97","null")
//        Log.d("After_SP","${sp_value}")

    }
}