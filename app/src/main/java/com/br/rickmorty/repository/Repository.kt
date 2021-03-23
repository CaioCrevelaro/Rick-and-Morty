package com.br.rickmorty.repository

import com.br.rickmorty.model.CharacterResponse
import com.br.rickmorty.network.EndPoint
import com.br.rickmorty.network.RetrofitInit

class Repository {

    private var url = "https://rickandmortyapi.com/api/"

    private var service = EndPoint::class

    private val serviceRick = RetrofitInit(url).create(service)
    //Método que cria a conexão com todos os endpoints da API, que constam em
    // "network/Endpoint"

    suspend fun getCharacterService(): CharacterResponse = serviceRick
        .getResponseCharacter()
}