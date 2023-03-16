package com.example.kotlin_study_livedata_lifecycle

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_study_livedata_lifecycle.databinding.FragmentBlank1Binding

class BlankFragment1 : Fragment() {

    // ViewBinding + LiveData

    private val TAG = "BlankFragment1"

    private var _binding: FragmentBlank1Binding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: BlankViewModel1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlank1Binding.inflate(inflater,container,false)
        val view = binding.root

        viewModel = ViewModelProvider(this).get(BlankViewModel1::class.java)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn1.setOnClickListener {
            viewModel.plusCountValue()
        }
        viewModel.liveCount.observe(viewLifecycleOwner, Observer {
            binding.text1.text = it.toString()
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG,"onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }


}