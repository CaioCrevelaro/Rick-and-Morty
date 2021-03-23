package com.br.rickmorty.network

import com.br.rickmorty.model.CharacterResponse
import retrofit2.http.GET

interface EndPoint {

    @GET("character")//Verbo http "get" para character
    suspend fun getResponseCharacter(): CharacterResponse
    //Para a requisição de uma API, é uma boa prática a utilização de
    // multithread. Por essa razão se usa o método "suspend", indicando que
    // para essa função/método será usada uma outra thread.

    //Caso a API permitisse o método "post" a instrução seria como a seguir:
//    @POST("character")//Verbo http "post" para character
//    suspend fun getResponseCharacter(): CharacterResponse

    //Caso fosse necessária uma API key para a requisição, o método seria
    // como o mostrado abaixo, onde "A1234j9k90i3" é a API key:
//    @GET("character"/A1234j9k90i3)
//    suspend fun getResponseCharacter(): CharacterResponse

    @GET("location")
    suspend fun getResponseLocation()

    @GET("episode")
    suspend fun getResponseEpisode()
}