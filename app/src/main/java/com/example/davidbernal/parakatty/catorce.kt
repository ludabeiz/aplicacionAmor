package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class catorce : AppCompatActivity() {

    lateinit var boton14:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catorce)

        boton14 = findViewById(R.id.botonseguir14)

        boton14.setOnClickListener {
            val intent = Intent(this, quince::class.java)
            startActivity(intent)
        }
    }
}
