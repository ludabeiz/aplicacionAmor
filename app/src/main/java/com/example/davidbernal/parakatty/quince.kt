package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class quince : AppCompatActivity() {

    lateinit var boton15:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quince)

        boton15 = findViewById(R.id.botonseguir15)

        boton15.setOnClickListener {
            val intent = Intent(this, dieciseis::class.java)
            startActivity(intent)
        }
    }
}
