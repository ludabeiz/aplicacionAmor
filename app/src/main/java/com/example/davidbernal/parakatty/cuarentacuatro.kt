package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cuarentacuatro : AppCompatActivity() {

    lateinit var boton44:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuarentacuatro)

        boton44 = findViewById(R.id.botonseguir44)

        boton44.setOnClickListener {
            val intent = Intent(this, cuarentacinco::class.java)
            startActivity(intent)
        }
    }
}
