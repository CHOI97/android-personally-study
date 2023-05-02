package com.example.tablettest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.tablettest.databinding.NewsContentFragBinding

class NewsContentFragment: Fragment()  {
    private var _binding: NewsContentFragBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = NewsContentFragBinding.inflate(inflater,container,false)
        return binding.root
    }

    fun refresh(title: String, content: String){
        binding.contentLayout.visibility = View.VISIBLE
        binding.newsTitle.text = title
        binding.newsContent.text = content
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.contentLayout.visibility = View.VISIBLE
//        binding.newsTitle.text = arguments?.getString("news_title")
//        binding.newsContent.text = arguments?.getString("content")
//        contentLayout = view.findViewById(R.id.contentLayout)
//        newsTitle = view.findViewById(R.id.newsTitle)
//        newsContent = view.findViewById(R.id.newsContent)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}