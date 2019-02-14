package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class doce : AppCompatActivity() {

    lateinit var boton12:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doce)

        boton12 = findViewById(R.id.botonseguir12)

        boton12.setOnClickListener {
            val intent = Intent(this, trece::class.java)
            startActivity(intent)
        }
    }
}
