package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class dieciseis : AppCompatActivity() {

    lateinit var boton16:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieciseis)

        boton16 = findViewById(R.id.botonseguir16)

        boton16.setOnClickListener {
            val intent = Intent(this, diecisiete::class.java)
            startActivity(intent)
        }
    }
}
