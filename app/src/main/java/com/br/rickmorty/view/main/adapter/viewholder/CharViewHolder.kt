package com.br.rickmorty.view.main.adapter.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.br.rickmorty.R

class CharViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val name by lazy { itemView.findViewById<TextView>(R.id.character_name) }
    val location by lazy { itemView.findViewById<TextView>(R.id.character_location) }
    val image by lazy { itemView.findViewById<ImageView>(R.id.character_image) }
}