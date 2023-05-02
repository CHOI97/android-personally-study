package com.example.tablettest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.tablettest.databinding.ActivityNewsContentBinding

class NewsContentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewsContentBinding
    companion object {
        fun actionStart(context: Context, title: String, content: String) {
            val intent = Intent(context, NewsContentActivity::class.java).apply {
                putExtra("news_title", title)
                putExtra("news_content", content)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsContentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("activity", "NewsContentActivity")

        val title = intent.getStringExtra("news_title")
        val content = intent.getStringExtra("news_content")
//        val newsContentFrag = supportFragmentManager.findFragmentById(R.id.newsContentFrag)
        val newsContentFrag = NewsContentFragment()

        if (title != null && content != null) {
            val bundle = Bundle()
            bundle.putString("news_title",title)
            bundle.putString("content",content)
//            newsContentFrag.refresh(title,content)
            newsContentFrag.arguments = bundle
            supportFragmentManager.beginTransaction().replace(R.id.newsContentFrag,newsContentFrag)
                .addToBackStack(null)
                .commit()
        }
    }
}