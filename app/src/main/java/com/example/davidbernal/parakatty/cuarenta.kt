package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cuarenta : AppCompatActivity() {

    lateinit var boton40:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuarenta)

        boton40 = findViewById(R.id.botonseguir40)

        boton40.setOnClickListener {
            val intent = Intent(this, cuarentauno::class.java)
            startActivity(intent)
        }
    }
}
