package com.br.rickmorty.view.CharDetail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.br.rickmorty.R

class CharDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_char_detail)

        val charName = findViewById<TextView>(R.id.char_detail_name)

        val intent = intent.extras
        val name = intent?.getString("NAME")

        charName.text = name!!
    }
}