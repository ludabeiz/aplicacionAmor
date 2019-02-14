package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class diecisiete : AppCompatActivity() {

    lateinit var boton17:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diecisiete)

        boton17 = findViewById(R.id.botonseguir17)

        boton17.setOnClickListener {
            val intent = Intent(this, dieciocho::class.java)
            startActivity(intent)
        }
    }
}
