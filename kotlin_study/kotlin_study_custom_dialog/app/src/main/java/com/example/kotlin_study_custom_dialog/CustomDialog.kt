package com.example.kotlin_study_custom_dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import com.example.kotlin_study_custom_dialog.databinding.DialogDefaultBinding

class CustomDialog(
    context: Context
) : Dialog(context) { // 뷰를 띄워야하므로 Dialog 클래스는 context를 인자로 받는다.

    private lateinit var binding: DialogDefaultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 만들어놓은 dialog_custom_first.xml 뷰를 띄운다.
        binding = DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.dialog_default,null,false)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        // background를 투명하게 만듦
        // (중요) Dialog는 내부적으로 뒤에 흰 사각형 배경이 존재하므로, 배경을 투명하게 만들지 않으면
        setContentView(binding.root)
    }
}
