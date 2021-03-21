package com.br.rickmorty.view.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.br.rickmorty.R
import com.br.rickmorty.singleton.Character
import com.br.rickmorty.view.main.adapter.viewholder.CharViewHolder

class CharAdapter(val charList: List<Character>):RecyclerView.Adapter<CharViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item_activity_main, parent, false)
        return CharViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharViewHolder, position: Int) {

        val image = holder.image
        image.setImageResource(charList[position].image)

        val name = holder.name
        name.text = charList[position].name

        val location = holder.location
        location.text = "Location: " + charList[position].location
    }

    override fun getItemCount(): Int = charList.size
}