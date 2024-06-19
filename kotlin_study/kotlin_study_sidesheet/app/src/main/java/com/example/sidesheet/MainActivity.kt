
//
//import android.os.Bundle
//import android.view.MotionEvent
//import android.widget.Toast
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import androidx.drawerlayout.widget.DrawerLayout
//import com.example.sidesheet.databinding.ActivityMainBinding
//
//class MainActivity : AppCompatActivity() {
//    private val binding: ActivityMainBinding by lazy {
//        ActivityMainBinding.inflate(layoutInflater)
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(binding.root)
//        // Root Layout 설정
//        val rootLayout = binding.root
////        val targetView = binding.viewRect
//        val drawerLayout = binding.viewRect
////        rootLayout.setOnTouchListener { _, event ->
////            if (event.action == MotionEvent.ACTION_DOWN) {
////                val touchX = event.x
////                val touchY = event.y
////
////                val viewRect = targetView.run {
////                    val location = IntArray(2)
////                    getLocationOnScreen(location)
////                    android.graphics.Rect(location[0], location[1], location[0] + width, location[1] + height)
////                }
////
////                // 터치 좌표가 View 영역 외부인지 확인
////                if (!viewRect.contains(touchX.toInt(), touchY.toInt())) {
////                    Toast.makeText(this, "View 외부 터치!", Toast.LENGTH_SHORT).show()
////                }
////            }
////            true
////        }
//
//    }
//
//}
package com.example.sidesheet

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sidesheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewRect.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                Log.d("Touch Listener","inside")
                true
            } else {
                false
            }
        }

        binding.btnOpen.setOnClickListener {
            Toast.makeText(this,"Touch",Toast.LENGTH_SHORT).show()
            binding.fcw.visibility = View.VISIBLE
        }
    }
}
