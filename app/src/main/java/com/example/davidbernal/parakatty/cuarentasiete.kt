package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cuarentasiete : AppCompatActivity() {

    lateinit var boton47:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuarentasiete)

        boton47 = findViewById(R.id.botonseguir47)

        boton47.setOnClickListener {
            val intent = Intent(this, cuarentaocho::class.java)
            startActivity(intent)
        }
    }
}
