package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class treintasiete : AppCompatActivity() {

    lateinit var botono37:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treintasiete)

        botono37 = findViewById(R.id.botonseguir37)

        botono37.setOnClickListener {
            val intent = Intent(this, treintaocho::class.java)
            startActivity(intent)
        }
    }
}
