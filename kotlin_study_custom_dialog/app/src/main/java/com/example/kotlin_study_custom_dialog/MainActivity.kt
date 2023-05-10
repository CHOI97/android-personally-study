package com.example.kotlin_study_custom_dialog

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import com.example.kotlin_study_custom_dialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "Dialog"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 기본 다이얼로그
        binding.dialog1.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Title")
                .setMessage("기본 다이얼로그")
                .create()
                .show()
        }

        // 버튼이 있는 다이얼로그
        binding.dialog2.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("버튼이 있는 다이얼로그")
                .setMessage("버튼 다이얼로그 입니다.")
                .setPositiveButton("ok", object : DialogInterface.OnClickListener {
                    override fun onClick(dialog: DialogInterface?, which: Int) {
                        Log.d(TAG,"OK")
                    }
                })
                .setNegativeButton("no", object : DialogInterface.OnClickListener {
                    override fun onClick(dialog: DialogInterface?, which: Int) {
                        Log.d(TAG,"NO")
                    }
                })
                .setNeutralButton("neutral",object : DialogInterface.OnClickListener{
                    override fun onClick(dialog: DialogInterface?, which: Int) {
                        Log.d(TAG,"NEUTRAL")
                    }

                })
                .create()
                .show()
        }

    }
}