package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class treintatres : AppCompatActivity() {

    lateinit var boton33:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treintatres)

        boton33= findViewById(R.id.botonseguir33)

        boton33.setOnClickListener {
            val intent = Intent(this, treintacuatro::class.java)
            startActivity(intent)
        }
    }
}
