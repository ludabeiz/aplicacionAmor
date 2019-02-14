package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class veintiuno : AppCompatActivity() {

    lateinit var boton21:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veintiuno)

        boton21 = findViewById(R.id.botonseguir21)

        boton21.setOnClickListener {
            val intent = Intent(this, veintidos::class.java)
            startActivity(intent)
        }
    }
}
