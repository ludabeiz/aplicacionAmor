package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class veintiocho : AppCompatActivity() {

    lateinit var boton28:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veintiocho)

        boton28 = findViewById(R.id.botonseguir28)

        boton28.setOnClickListener {
            val intent = Intent(this, veintinueve::class.java)
            startActivity(intent)
        }
    }
}
