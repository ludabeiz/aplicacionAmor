package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cinco : AppCompatActivity() {

    lateinit var butonSeguir2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinco)

        butonSeguir2 = findViewById(R.id.botonseguir2)

        butonSeguir2.setOnClickListener {
            val intent = Intent(this, seis::class.java)
            startActivity(intent)
        }
    }
}
