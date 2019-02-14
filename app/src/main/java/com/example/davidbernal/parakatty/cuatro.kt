package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cuatro : AppCompatActivity() {

    lateinit var botonSeguir1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuatro)

        botonSeguir1 = findViewById(R.id.botonseguir1)

        botonSeguir1.setOnClickListener {
            val intent = Intent(this, cinco::class.java)
            startActivity(intent)
        }
    }
}
