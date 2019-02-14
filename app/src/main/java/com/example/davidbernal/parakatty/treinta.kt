package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class treinta : AppCompatActivity() {

    lateinit var boton30:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treinta)

        boton30 = findViewById(R.id.botonseguir30)

        boton30.setOnClickListener {
            val intent = Intent(this, treintauno::class.java)
            startActivity(intent)
        }
    }
}
