package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cuarentacinco : AppCompatActivity() {

    lateinit var boton45:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuarentacinco)

        boton45= findViewById(R.id.botonseguir45)

        boton45.setOnClickListener {
            val intent = Intent(this, cuarentaseis::class.java)
            startActivity(intent)
        }
    }
}
