package com.example.tablettest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class NewsContentActivity : AppCompatActivity() {

    companion object{
        fun actionStart(context: Context, title: String, content: String){
            val intent = Intent(context, NewsContentActivity::class.java).apply {
                putExtra("news_title", title)
                putExtra("news_content", content)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_content)
        val title = intent.getStringExtra("news_title")
        val content = intent.getStringExtra("news_content")
        val newsContentFrag = findViewById<View>(R.id.newsContentFrag)
        if(title != null && content != null) {
            val fragment = newsContentFrag as NewsContentFragment
            fragment.refresh(title,content)
        }
    }
}