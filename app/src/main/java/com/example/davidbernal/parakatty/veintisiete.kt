package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class veintisiete : AppCompatActivity() {

    lateinit var boton27:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veintisiete)

        boton27 = findViewById(R.id.botonseguir27)

        boton27.setOnClickListener {
            val intent = Intent(this, veintiocho::class.java)
            startActivity(intent)
        }
    }
}
