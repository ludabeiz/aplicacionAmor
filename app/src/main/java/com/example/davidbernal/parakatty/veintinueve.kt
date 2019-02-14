package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class veintinueve : AppCompatActivity() {

    lateinit var boton29:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veintinueve)

        boton29 = findViewById(R.id.botonseguir29)

        boton29.setOnClickListener {
            val intent = Intent(this, treinta::class.java)
            startActivity(intent)
        }
    }
}
