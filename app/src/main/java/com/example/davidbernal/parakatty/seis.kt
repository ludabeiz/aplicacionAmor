package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class seis : AppCompatActivity() {

    lateinit var botonSeguir3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seis)

        botonSeguir3 = findViewById(R.id.botonseguir3)

        botonSeguir3.setOnClickListener {
            val intent = Intent(this, siete::class.java)
            startActivity(intent)
        }
    }
}
