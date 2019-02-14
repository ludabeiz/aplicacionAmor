package com.example.davidbernal.parakatty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash_activity : AppCompatActivity() {

    val SPLASH_TIME_OUT = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_activity)

        Handler().postDelayed(object : Runnable{
            public override fun run(){
                val home = Intent(this@splash_activity,MainActivity::class.java)
                startActivity(home)
                finish()
            }
        },SPLASH_TIME_OUT.toLong())
    }
}
