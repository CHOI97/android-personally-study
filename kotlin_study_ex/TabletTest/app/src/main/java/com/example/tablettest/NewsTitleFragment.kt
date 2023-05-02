package com.example.tablettest

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tablettest.databinding.NewsItemBinding
import com.example.tablettest.databinding.NewsTitleFragmentBinding

class NewsTitleFragment : Fragment() {
    private var _binding: NewsTitleFragmentBinding? = null
    private val binding get() = _binding!!
    private var isTwoPane = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = NewsTitleFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        isTwoPane = activity?.findViewById<View>(R.id.newsContentLayout) != null

//        val temp = activity?.findViewById<RecyclerView>(R.id.newsTitleRecyclerView)
        binding.newsTitleRecyclerView.layoutManager = LinearLayoutManager(activity)
        binding.newsTitleRecyclerView.adapter = NewsAdapter(getNews())
//        val newsTitleRecyclerView = temp as RecyclerView
//        val mlayoutManager = LinearLayoutManager(activity)
//        newsTitleRecyclerView.layoutManager = mlayoutManager

//        val madapter = NewsAdapter(getNews())
//        newsTitleRecyclerView.adapter = madapter
    }

    private fun getNews(): List<News> {
        val newsList = ArrayList<News>()
        for (i in 1..50) {
            val news =
                News("This is news title $i", getRandomLengthString("This is news content $i."))
            newsList.add(news)
        }
        return newsList
    }

    private fun getRandomLengthString(str: String): String {
        val n = (1..20).random()
        val builder = StringBuilder()
        repeat(n) {
            builder.append(str)
        }
        return builder.toString()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    inner class NewsAdapter(val newsList: List<News>) :
        RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

        inner class ViewHolder(private val binding: NewsItemBinding) : RecyclerView.ViewHolder(binding.root) {
            val newsTitle: TextView = binding.newsTitle
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view =
                NewsItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
            val holder = ViewHolder(view)
            holder.itemView.setOnClickListener {
                val news = newsList[holder.adapterPosition]
                if (isTwoPane) {
                    Log.d("holder","click holder")
//                    val newsContentFrag = findViewById(R.id.newsContentFrag)
//                    val fragment = holder.newsContentFrag as NewsContentFragment
//                    fragment.refresh(news.title, news.content)

                } else {
                    Log.d("action start","before")
                    NewsContentActivity.actionStart(context!!, news.title, news.content)
                }
            }
            return holder
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val news = newsList[position]
            holder.newsTitle.text = news.title
        }

        override fun getItemCount() = newsList.size

    }

}