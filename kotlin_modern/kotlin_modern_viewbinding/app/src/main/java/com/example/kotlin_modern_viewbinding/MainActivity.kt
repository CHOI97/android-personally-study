package com.example.kotlin_modern_viewbinding

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.kotlin_modern_viewbinding.databinding.ActivityMainBinding


/*
    findViewById -> kotlin-android-extensions 을 사용하면 생략하고 사용가능
    다른 XML에서 id가 혼동될 여지가 있음
    Android 4.1 부터 viewBinding을 사용하도록 하고 있음

    viewBinding 활성화시 각 xml 파일에 대해 viewBinding 클래스를 상속받는 개별 viewBinding class 생성
    인스턴스를 생성하면 view의 Id를 프로퍼티로 제공한다

    viewBinding 장점
    - Null-safe : 서로 다른 layout Id를 가진 뷰를 정확히 구분할 수 있다.
    - Type-safe : 잘못된 타입을 지정할 우려에서 벗어날 수 있다. ex) findViewById<Button> -> TextView (Error)
 */

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    // viewBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // viewBinding class Instance
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}