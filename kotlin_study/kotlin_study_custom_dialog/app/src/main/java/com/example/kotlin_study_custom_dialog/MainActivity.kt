package com.example.kotlin_study_custom_dialog

import android.content.DialogInterface
import android.content.Intent
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
import androidx.databinding.DataBindingUtil
import com.example.kotlin_study_custom_dialog.databinding.ActivitiySecondBinding
import com.example.kotlin_study_custom_dialog.databinding.ActivityMainBinding

/*
* Alert Dialog
* */
class MainActivity : AppCompatActivity() {
    private val TAG = "Dialog"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

        // 기본 다이얼로그
        binding.btnDefaultDialog.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Title")
                .setMessage("기본 다이얼로그")
                .create()
                .show()
        }

        // 버튼이 있는 다이얼로그
        binding.btnButtonDialog.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("버튼이 있는 다이얼로그")
                .setMessage("버튼 다이얼로그 입니다.")
                .setPositiveButton("ok"
                ) { dialog, which -> Log.d(TAG, "OK") }
                .setNegativeButton("no"
                ) { dialog, which -> Log.d(TAG, "NO") }
                .setNeutralButton("neutral"
                ) { dialog, which -> Log.d(TAG, "NEUTRAL") }
                .create()
                .show()
        }
        // 리스트
        val array = arrayOf("dog", "cat", "cow")
        binding.btnListDialog.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("list")
                .setItems(array) { dialog, which ->
                    val currentItem = array[which]
                    Log.d("MyTag", "currentItem : $currentItem")
                }
                .show()
        }
        // 체크박스
        val checkedArray = booleanArrayOf(true, false, true)
        binding.btnCheckboxDialog.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("checkbox")
                .setMultiChoiceItems(array, checkedArray
                ) { dialog, which, isChecked ->
                    Log.d(TAG, "which : $which, isChecked : $isChecked")
                    checkedArray[which] = isChecked
                }
                .setPositiveButton("ok"
                ) { dialog, which ->
                    Log.d(
                        TAG,
                        "checkedItems : ${checkedArray.contentToString()}"
                    )
                }
                .show()

        }

        // 라디오 버튼
        binding.btnRadioDialog.setOnClickListener {
            var checkedItemPosition = 0

            AlertDialog.Builder(this)
                .setTitle("radio")
                .setSingleChoiceItems(array, checkedItemPosition, object : DialogInterface.OnClickListener {
                    override fun onClick(dialog: DialogInterface, which: Int) {
                        Log.d("MyTag", "which : $which")
                        checkedItemPosition = which
                    }
                })
                .setPositiveButton("ok", object : DialogInterface.OnClickListener {
                    override fun onClick(dialog: DialogInterface?, which: Int) {
                        Log.d("MyTag", "checkedItemPosition : $checkedItemPosition")
                    }
                })
                .show()
        }

        binding.btnGoCustom.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}