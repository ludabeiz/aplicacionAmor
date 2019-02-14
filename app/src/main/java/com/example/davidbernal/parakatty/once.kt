package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class once : AppCompatActivity() {

    lateinit var boton11:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_once)

        boton11 = findViewById(R.id.botonseguir11)

        boton11.setOnClickListener {
            val intent = Intent(this, doce::class.java)
            startActivity(intent)
        }

    }
}
