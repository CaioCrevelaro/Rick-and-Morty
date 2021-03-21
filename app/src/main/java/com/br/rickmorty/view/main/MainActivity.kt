package com.br.rickmorty.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.br.rickmorty.R
import com.br.rickmorty.singleton.CharList
import com.br.rickmorty.view.main.adapter.CharAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        setContentView(R.layout.activity_main)

        val recyclerView by lazy { findViewById<RecyclerView>(R.id.rv_activity_main) }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CharAdapter(CharList.list)
    }
}