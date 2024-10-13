package com.example.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ArticleDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_details)

        val title: String? = intent.getStringExtra("title")
        val date: String? = intent.getStringExtra("date")
        val details: String? = intent.getStringExtra("details")
        val image: Int = intent.getIntExtra("image", R.drawable.blog2)

        findViewById<TextView>(R.id.title2).text = title
        findViewById<TextView>(R.id.date).text = date
        findViewById<TextView>(R.id.details).text = details
        findViewById<ImageView>(R.id.image2).setImageResource(image)
    }
}