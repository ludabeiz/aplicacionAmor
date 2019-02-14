package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cuarentaocho : AppCompatActivity() {

    lateinit var boton48:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuarentaocho)

        boton48 = findViewById(R.id.botonseguir48)

        boton48.setOnClickListener {
            val intent = Intent(this, cuarentanueve::class.java)
            startActivity(intent)
        }
    }
}
