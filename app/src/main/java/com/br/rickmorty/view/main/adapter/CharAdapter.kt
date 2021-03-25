package com.br.rickmorty.view.main.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.br.rickmorty.R
import com.br.rickmorty.model.Result
import com.br.rickmorty.singleton.Character
import com.br.rickmorty.view.CharDetail.CharDetailActivity
import com.br.rickmorty.view.main.adapter.viewholder.CharViewHolder
import com.squareup.picasso.Picasso

class CharAdapter(
    private val list: List<Result>,
    private val context: Context
) : RecyclerView
.Adapter<CharViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CharViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.recycler_view_item_activity_main, parent, false)
        return CharViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharViewHolder, position: Int) {
        val character = list.elementAt(position)

//        val image = holder.image
//        image.setImageResource(api_image)
//        val api_image = Picasso.get().load(character.image)
        Picasso.get().load(character.image).into(holder.image)

        holder.name.text = character.name
        holder.location.text = character.location.name

        val card = holder.itemView
        card.setOnClickListener {

            val intent = Intent(it.context, CharDetailActivity::class.java)
            intent.putExtra("NAME", character.name)
            intent.putExtra("LOCATION",character.location.name)
            it.context.startActivity(intent)
        }


//Implementação anterior, com o Singleton
//        val image = holder.image
//        image.setImageResource(charList[position].image)
//
//        val name = holder.name
//        name.text = charList[position].name
//
//        val location = holder.location
//        location.text = "Location: " + charList[position].location
    }

    override fun getItemCount(): Int = list.size
}