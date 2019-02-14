package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class siete : AppCompatActivity() {

    lateinit var boton7:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siete)

        boton7 = findViewById(R.id.botonseguir7)

        boton7.setOnClickListener {
            val intent = Intent(this, ocho::class.java)
            startActivity(intent)
        }
    }
}
