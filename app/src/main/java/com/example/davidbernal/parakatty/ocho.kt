package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ocho : AppCompatActivity() {

    lateinit var boton8:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ocho)

        boton8 = findViewById(R.id.botonseguir8)

        boton8.setOnClickListener {
            val intent = Intent(this, nueve::class.java)
            startActivity(intent)
        }
    }
}
