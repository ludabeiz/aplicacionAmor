package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tres : AppCompatActivity() {

    lateinit var botonSeguir:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tres)

        botonSeguir = findViewById(R.id.butonSeguir)

        botonSeguir.setOnClickListener {
            val intent = Intent(this, cuatro::class.java)
            startActivity(intent)
        }

    }
}
