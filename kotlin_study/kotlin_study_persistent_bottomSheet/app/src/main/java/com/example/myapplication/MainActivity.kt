package com.example.myapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.includedBottomSheet.clBottomSheet.maxHeight = getBottomSheetDialogDefaultHeight()

        bottomSheetBehavior = BottomSheetBehavior.from(binding.includedBottomSheet.clBottomSheet)

        bottomSheetBehavior.state = BottomSheetBehavior.STATE_HALF_EXPANDED

        bottomSheetBehavior.addBottomSheetCallback(object: BottomSheetBehavior.BottomSheetCallback(){
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when(newState){
                    BottomSheetBehavior.STATE_HIDDEN->{
                        Log.d("Bottom Sheet State","STATE_HIDDEN")
                    }
                    BottomSheetBehavior.STATE_EXPANDED->{
                        Log.d("Bottom Sheet State","STATE_EXPANDED")
                    }
                    BottomSheetBehavior.STATE_COLLAPSED->{
                        Log.d("Bottom Sheet State","STATE_COLLAPSED")
                    }
                    BottomSheetBehavior.STATE_DRAGGING->{
                        Log.d("Bottom Sheet State","STATE_DRAGGING")
                    }
                    BottomSheetBehavior.STATE_SETTLING->{
                        Log.d("Bottom Sheet State","STATE_SETTLING")
                    }
                    BottomSheetBehavior.STATE_HALF_EXPANDED->{
                        Log.d("Bottom Sheet State","STATE_HALF_EXPANDED")
                    }
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }

        })
    }
    private fun getBottomSheetDialogDefaultHeight(): Int {
        return getWindowHeight() * 70 / 100
        // 위 수치는 기기 높이 대비 70%로 높이를 설정
    }

    private fun getWindowHeight(): Int {
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        return displayMetrics.heightPixels
    }
}