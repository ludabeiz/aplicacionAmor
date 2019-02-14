package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class treintaseis : AppCompatActivity() {

    lateinit var boton36:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treintaseis)

        boton36 = findViewById(R.id.botonseguir36)

        boton36.setOnClickListener {
            val intent = Intent(this, treintasiete::class.java)
            startActivity(intent)
        }
    }
}
