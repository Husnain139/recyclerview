package com.example.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Make sure to spell the class name correctly (ArticleViewHolder)
class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val image: ImageView = itemView.findViewById(R.id.image1)
    val title: TextView = itemView.findViewById(R.id.Title1)
}
