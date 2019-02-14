package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class treintacinco : AppCompatActivity() {

    lateinit var boton35:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treintacinco)

        boton35 =findViewById(R.id.botonseguir35)

        boton35.setOnClickListener {
            val intent = Intent(this, treintaseis::class.java)
            startActivity(intent)
        }
    }
}
