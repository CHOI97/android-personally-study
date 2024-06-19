package com.example.sidesheet

import android.content.Context
import android.view.Gravity
import android.view.WindowManager
import com.example.sidesheet.databinding.SideSheetLayoutBinding
import com.google.android.material.sidesheet.SideSheetDialog

class TaskBarDialog(private val context: Context) : SideSheetDialog(context) {

    init {
        val binding = SideSheetLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 다이얼로그의 위치를 설정하는 코드
        this.window?.apply {
            setSheetEdge(Gravity.START)
            // 애니메이션을 제거하는 코드
            setWindowAnimations(0)
            behavior.isDraggable = false
            setCanceledOnTouchOutside(true)
            attributes.windowAnimations = R.style.SideSheetAnimation
        }
        binding.root.setOnClickListener {
            // 이 부분에 클릭 이벤트를 소비하도록 함. 아무 동작도 하지 않게 하려면 여기를 비워둘 수 있음.
        }
    }
}
