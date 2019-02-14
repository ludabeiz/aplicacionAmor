package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cuarentaseis : AppCompatActivity() {

    lateinit var boton46:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuarentaseis)

        boton46 = findViewById(R.id.botonseguir46)

        boton46.setOnClickListener {
            val intent = Intent(this, cuarentasiete::class.java)
            startActivity(intent)
        }
    }
}
