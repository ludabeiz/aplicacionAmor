package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class dos : AppCompatActivity() {

    lateinit var butonSi:Button
    lateinit var butonNo:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dos)

        butonNo = findViewById(R.id.buttonNo)

        butonSi = findViewById(R.id.bottonSi)

        butonNo.setOnClickListener {
            val intent = Intent(this, tres::class.java)
            startActivity(intent)
        }

        butonSi.setOnClickListener {
            val intent = Intent(this, cuatro::class.java)
            startActivity(intent)
        }


    }
}
