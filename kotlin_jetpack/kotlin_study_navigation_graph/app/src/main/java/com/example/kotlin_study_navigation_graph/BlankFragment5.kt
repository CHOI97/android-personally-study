package com.example.kotlin_study_navigation_graph

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation

// 첫번째로 Fragment5 에서 backButton 누르면 Fragment1로 이동
class BlankFragment5 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)

//        val callback: OnBackPressedCallback = object : OnBackPressedCallback(true){
//            override fun handleOnBackPressed() {
//                Log.d("BlankFragment5","pressed")
//                view?.let{
//                    Navigation.findNavController(it).navigate(R.id.action_blankFragment5_to_blankFragment1)
//                }
//            }
//        }
//        requireActivity().onBackPressedDispatcher.addCallback(this,callback)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank5, container, false)
    }
}