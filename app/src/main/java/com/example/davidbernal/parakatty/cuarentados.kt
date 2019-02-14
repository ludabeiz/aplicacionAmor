package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cuarentados : AppCompatActivity() {

    lateinit var boton42:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuarentados)

        boton42 = findViewById(R.id.botonseguir42)

        boton42.setOnClickListener {
            val intent = Intent(this, cuarentatres::class.java)
            startActivity(intent)
        }
    }
}
