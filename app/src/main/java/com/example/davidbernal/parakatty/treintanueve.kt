package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class treintanueve : AppCompatActivity() {

    lateinit var boton39:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treintanueve)

        boton39 = findViewById(R.id.botonseguir39)

        boton39.setOnClickListener {
            val intent = Intent(this, cuarenta::class.java)
            startActivity(intent)
        }
    }
}
