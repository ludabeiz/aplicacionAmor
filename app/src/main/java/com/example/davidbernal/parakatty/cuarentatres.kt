package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cuarentatres : AppCompatActivity() {

    lateinit var boton43:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuarentatres)

        boton43 = findViewById(R.id.botonseguir43)

        boton43.setOnClickListener {
            val intent = Intent(this, cuarentacuatro::class.java)
            startActivity(intent)
        }
    }
}
