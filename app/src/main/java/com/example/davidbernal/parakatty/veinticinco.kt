package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class veinticinco : AppCompatActivity() {

    lateinit var boton25:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veinticinco)

        boton25 = findViewById(R.id.botonseguir25)

        boton25.setOnClickListener {
            val intent = Intent(this, veintiseis::class.java)
            startActivity(intent)
        }
    }
}
