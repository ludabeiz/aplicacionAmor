package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class treintaocho : AppCompatActivity() {

    lateinit var boton38:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treintaocho)

        boton38 = findViewById(R.id.botonseguir38)

        boton38.setOnClickListener {
            val intent = Intent(this, treintanueve::class.java)
            startActivity(intent)
        }
    }
}
