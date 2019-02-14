package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class treintados : AppCompatActivity() {

    lateinit var boton32:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treintados)

        boton32=findViewById(R.id.botonseguir32)

        boton32.setOnClickListener {
            val intent = Intent(this, treintatres::class.java)
            startActivity(intent)
        }
    }
}
