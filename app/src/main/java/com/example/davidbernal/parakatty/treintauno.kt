package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class treintauno : AppCompatActivity() {

    lateinit var boton31:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treintauno)

        boton31 = findViewById(R.id.botonseguir31)

        boton31.setOnClickListener {
            val intent = Intent(this, treintados::class.java)
            startActivity(intent)
        }
    }
}
