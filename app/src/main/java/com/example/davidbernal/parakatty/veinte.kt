package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class veinte : AppCompatActivity() {

    lateinit var boton20:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veinte)

        boton20 = findViewById(R.id.botonseguir20)

        boton20.setOnClickListener {
            val intent = Intent(this, veintiuno::class.java)
            startActivity(intent)
        }

    }
}
