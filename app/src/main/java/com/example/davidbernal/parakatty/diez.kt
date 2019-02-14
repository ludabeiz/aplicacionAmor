package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class diez : AppCompatActivity() {

    lateinit var boton10:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diez)

        boton10 = findViewById(R.id.botonseguir10)

        boton10.setOnClickListener {
            val intent = Intent(this, once::class.java)
            startActivity(intent)
        }
    }
}
