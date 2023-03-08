package com.example.kotlin_study_databinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.kotlin_study_databinding.databinding.FragmentTestBinding

class TestFragment : Fragment() {
    private lateinit var binding : FragmentTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_test, container,false)
        binding.fragmentText.text = "변경된 텍스트"
        return binding.root
    }

}