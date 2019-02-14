package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class veintcuatro : AppCompatActivity() {

    lateinit var boton24:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veintcuatro)

        boton24 = findViewById(R.id.botonseguir24)

        boton24.setOnClickListener {
            val intent = Intent(this, veinticinco::class.java)
            startActivity(intent)
        }
    }
}
