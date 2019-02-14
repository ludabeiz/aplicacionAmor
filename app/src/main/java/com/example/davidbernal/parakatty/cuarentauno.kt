package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cuarentauno : AppCompatActivity() {

    lateinit var boton41:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuarentauno)

        boton41 = findViewById(R.id.botonseguir41)

        boton41.setOnClickListener {
            val intent = Intent(this, cuarentados::class.java)
            startActivity(intent)
        }


    }
}
