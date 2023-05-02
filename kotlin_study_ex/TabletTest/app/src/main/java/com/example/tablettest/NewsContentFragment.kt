package com.example.tablettest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class NewsContentFragment: Fragment()  {

    lateinit var contentLayout : LinearLayout
    lateinit var newsTitle: TextView
    lateinit var newsContent: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.news_content_frag, container, false)
    }

    fun refresh(title: String, content: String){
        contentLayout.visibility = View.VISIBLE
        newsTitle.text = title
        newsContent.text = content
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        contentLayout = view.findViewById(R.id.contentLayout)
        newsTitle = view.findViewById(R.id.newsTitle)
        newsContent = view.findViewById(R.id.newsContent)
    }

}