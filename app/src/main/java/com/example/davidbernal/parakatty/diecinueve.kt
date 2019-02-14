package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class diecinueve : AppCompatActivity() {

    lateinit var boton19:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diecinueve)

        boton19 =findViewById(R.id.botonseguir19)

        boton19.setOnClickListener {
            val intent = Intent(this, veinte::class.java)
            startActivity(intent)
        }
    }
}
