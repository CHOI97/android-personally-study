package com.example.tablettest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewsTitleFragment: Fragment() {

    private var isTwoPane = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.news_title_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        isTwoPane = activity?.findViewById<View>(R.id.newsContentLayout) != null

        val temp = activity?.findViewById<RecyclerView>(R.id.newsTitleRecyclerView)
        val newsTitleRecyclerView = temp as RecyclerView
        val mlayoutManager = LinearLayoutManager(activity)
        newsTitleRecyclerView.layoutManager = mlayoutManager

        val madapter = NewsAdapter(getNews())
        newsTitleRecyclerView.adapter = madapter
    }

    private fun getNews(): List<News> {
        val newsList = ArrayList<News>()
        for (i in 1..50) {
            val news = News("This is news title $i", getRandomLengthString("This is news content $i."))
            newsList.add(news)
        }
        return newsList
    }

    private fun getRandomLengthString(str: String) : String {
        val n = (1..20).random()
        val builder = StringBuilder()
        repeat(n){
            builder.append(str)
        }
        return builder.toString()
    }

    inner class NewsAdapter(val newsList: List<News>): RecyclerView.Adapter<NewsAdapter.ViewHolder> () {

        inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
            val newsTitle : TextView = view.findViewById(R.id.newsTitle)
            val newsContentFrag = view.findViewById<View>(R.id.newsContentFrag)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
            val holder = ViewHolder(view)

            holder.itemView.setOnClickListener {
                val news = newsList[holder.adapterPosition]
                if(isTwoPane){
//                    val newsContentFrag = findViewById(R.id.newsContentFrag)
                    val fragment = holder.newsContentFrag as NewsContentFragment
                    fragment.refresh(news.title, news.content)
                } else {
                    NewsContentActivity.actionStart(parent.context, news.title, news.content)
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