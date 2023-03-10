package com.example.kotlin_study_viewmodel_fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_study_viewmodel_fragment.databinding.FragmentTestBinding

// Activity 와 Fragment 에 ViewModel 은 다르다

class TestFragment : Fragment() {
    private lateinit var binding: FragmentTestBinding
    var countValue = 0
    private lateinit var viewModel: TestFragmentViewModel
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TestFragment","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TestFragment","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("TestFragment","onCreateView")
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_test, container, false)

        viewModel = ViewModelProvider(this).get(TestFragmentViewModel::class.java)

        binding.resultArea.text = viewModel.getCount().toString()

        binding.plus.setOnClickListener {
           viewModel.plus()
            binding.resultArea.text = viewModel.getCount().toString()
        }
        binding.minus.setOnClickListener {
            viewModel.minus()
            binding.resultArea.text = viewModel.getCount().toString()
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        Log.d("TestFragment","onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TestFragment","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TestFragment","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TestFragment","onDestroy")
    }
}