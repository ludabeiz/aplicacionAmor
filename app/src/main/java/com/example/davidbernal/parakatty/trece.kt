package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class trece : AppCompatActivity() {

    lateinit var boton13:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trece)

        boton13 = findViewById(R.id.botonseguir13)

        boton13.setOnClickListener {
            val intent = Intent(this, catorce::class.java)
            startActivity(intent)
        }
    }
}
