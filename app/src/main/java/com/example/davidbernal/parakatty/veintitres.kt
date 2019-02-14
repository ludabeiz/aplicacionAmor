package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class veintitres : AppCompatActivity() {

    lateinit var boton23:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veintitres)

        boton23 = findViewById(R.id.botonseguir23)

        boton23.setOnClickListener {
            val intent = Intent(this, veintcuatro::class.java)
            startActivity(intent)
        }
    }
}
