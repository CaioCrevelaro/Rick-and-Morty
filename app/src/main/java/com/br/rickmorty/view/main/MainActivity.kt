package com.br.rickmorty.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.br.rickmorty.R
import com.br.rickmorty.model.Result
import com.br.rickmorty.singleton.CharList
import com.br.rickmorty.view.main.adapter.CharAdapter
import com.br.rickmorty.viewmodel.ViewModelMain

class MainActivity : AppCompatActivity() {

    private var results = mutableListOf<Result>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {

        setContentView(R.layout.activity_main)

        val recyclerView  = findViewById<RecyclerView>(R.id.rv_activity_main)

//        Análogo ao findById, mas para o ViewModel
        val viewModelCharacter = ViewModelProviders
            .of(this)
            .get(ViewModelMain::class.java)

//        Configuração do RecyclerView
        val adapterChar = CharAdapter(results, this)
        recyclerView.adapter = adapterChar

        recyclerView.layoutManager = LinearLayoutManager(this)

//        Requisição dos Dados do ViewModel
        viewModelCharacter.getAllCharacters()
        viewModelCharacter.listMutableCharacter.observe(this, Observer {
            it?.let { itChar -> results.addAll(itChar) }
            adapterChar.notifyDataSetChanged()
        })

//        Método anterior quando implementado o Singleton

//        setContentView(R.layout.activity_main)
//
//        val recyclerView by lazy { findViewById<RecyclerView>(R.id.rv_activity_main) }
//
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = CharAdapter(CharList.list)
    }
}