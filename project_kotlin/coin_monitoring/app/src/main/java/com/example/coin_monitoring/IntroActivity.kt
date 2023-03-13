package com.example.coin_monitoring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import timber.log.Timber

// Splash 화면 만들기
// handler -> 3초 뒤에 다른 액티비티 ex) MainActivity 로 이동
// https://developer.android.com/develop/ui/views/launch/splash-screen

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        Timber.d("onCreate")
    }
}