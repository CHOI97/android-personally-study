package com.example.kotlin_study_navigation_data_transfer

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs


class BlankFragment2 : Fragment() {

    val args : BlankFragment2Args by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        val view = inflater.inflate(R.layout.fragment_blank2, container, false)
//        val getString = arguments?.getString("key")
//        Log.d("BlankFragment2",getString.toString())

        Log.d("BlankFragment2",args.key)
        return view
    }

}