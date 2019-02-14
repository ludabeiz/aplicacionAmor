package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class veintiseis : AppCompatActivity() {

    lateinit var boton26:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veintiseis)

        boton26 = findViewById(R.id.botonseguir26)

        boton26.setOnClickListener {
            val intent = Intent(this, veintisiete::class.java)
            startActivity(intent)
        }
    }
}
