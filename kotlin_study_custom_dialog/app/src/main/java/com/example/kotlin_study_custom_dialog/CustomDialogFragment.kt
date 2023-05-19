package com.example.kotlin_study_custom_dialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.kotlin_study_custom_dialog.databinding.DialogFragmentBinding

/*
https://velog.io/@dear_jjwim/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EC%BB%A4%EC%8A%A4%ED%85%80-%EB%8B%A4%EC%9D%B4%EC%96%BC%EB%A1%9C%EA%B7%B8Custom-Dialog-%EB%A7%8C%EB%93%A4%EA%B8%B0-ClickListener%EB%A1%9C-%ED%81%B4%EB%A6%AD-%EC%9D%B4%EB%B2%A4%ED%8A%B8-%EC%A0%95%EC%9D%98%EA%B9%8C%EC%A7%80
*/

class CustomDialogFragment(
) : DialogFragment() {

    // 뷰 바인딩 정의
    private var _binding: DialogFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DialogFragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        // 레이아웃 배경을 투명하게 해줌, 필수 아님
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))


        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
