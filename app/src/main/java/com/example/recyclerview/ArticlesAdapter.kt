package com.example.recyclerview


import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import kotlin.math.log



class ArticlesAdapter( val articles: List<Article>,private  val context : Context) : RecyclerView.Adapter<ArticleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }


    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        Log.d("testing", "onBindViewHolder: Binding item# $position")
        val article = articles[position]
        holder.title.text = article.title
        holder.image.setImageResource(article.image)
        holder.itemView.setOnClickListener {


            val intent = Intent(context, ArticleDetailsActivity::class.java)
            intent.putExtra("title", article.title)
            intent.putExtra("image", article.image)
            intent.putExtra("date", article.date)
            intent.putExtra("details", article.details)
            context.startActivity(intent)

        }
    }


    override fun getItemCount(): Int {
        return articles.size
    }
}
