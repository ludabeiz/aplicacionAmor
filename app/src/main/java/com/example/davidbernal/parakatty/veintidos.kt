package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class veintidos : AppCompatActivity() {

    lateinit var boton22:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veintidos)

        boton22 = findViewById(R.id.botonseguir22)

        boton22.setOnClickListener {
            val intent = Intent(this, veintitres::class.java)
            startActivity(intent)
        }
    }
}
