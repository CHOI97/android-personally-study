package com.example.kotlin_study_navigation_data_transfer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

// Safe Args
class BlankFragment1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bundle = Bundle()
//        bundle.putString("key", "value")

        val view = inflater.inflate(R.layout.fragment_blank1, container, false)

        val action = BlankFragment1Directions.actionBlankFragment1ToBlankFragment2("abcdef")
//        val action = BlankFragment1Directions.actionBlankFragment1ToBlankFragment2()


        view.findViewById<Button>(R.id.btn1).setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.action_blankFragment1_to_blankFragment2,bundle)
            Navigation.findNavController(view).navigate(action)
        }
        return view
    }

}