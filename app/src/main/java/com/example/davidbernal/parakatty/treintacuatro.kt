package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class treintacuatro : AppCompatActivity() {

    lateinit var boton34:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treintacuatro)

        boton34 = findViewById(R.id.botonseguir34)

        boton34.setOnClickListener {
            val intent = Intent(this, treintacinco::class.java)
            startActivity(intent)
        }
    }
}
