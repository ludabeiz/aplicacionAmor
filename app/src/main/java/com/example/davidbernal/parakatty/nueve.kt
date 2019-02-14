package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class nueve : AppCompatActivity() {

    lateinit var boton9:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueve)

        boton9 = findViewById(R.id.botonseguir9)

        boton9.setOnClickListener {
            val intent = Intent(this, diez::class.java)
            startActivity(intent)
        }
    }
}
