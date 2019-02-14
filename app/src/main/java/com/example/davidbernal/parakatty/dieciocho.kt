package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class dieciocho : AppCompatActivity() {

    lateinit var boton18:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieciocho)

        boton18 = findViewById(R.id.botonseguir18)

        boton18.setOnClickListener {
            val intent = Intent(this, diecinueve::class.java)
            startActivity(intent)
        }
    }
}
