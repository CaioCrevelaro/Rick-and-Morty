package com.br.rickmorty.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.br.rickmorty.model.Result
import com.br.rickmorty.repository.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModelMain : ViewModel() {

    val listMutableCharacter = MutableLiveData<List<Result>>()
    private val repository = Repository()

    fun getAllCharacters() = CoroutineScope(Dispatchers.IO)
        .launch {
            repository.getCharacterService()
                .let { charactersResponse ->
                    listMutableCharacter
                        .postValue(charactersResponse.results)
                }
        }
}