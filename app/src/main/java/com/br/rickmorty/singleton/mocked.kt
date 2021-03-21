package com.br.rickmorty.singleton

import com.br.rickmorty.R

data class Character(
    val name: String,
    val location: String,
    val image: Int
)

object CharList {

    val character = Character(
        "Rick Sanchez",
        "Earth",
        R.drawable.rick_image_mock)

    val list = createList()

    fun createList ():List<Character>{

        val charList = mutableListOf<Character>()
        for (i in 1..10){charList.add(character)}
        return charList
    }

}

