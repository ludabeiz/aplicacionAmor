package com.example.davidbernal.parakatty

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Context.BIND_AUTO_CREATE
import android.content.ComponentName
import android.content.Context
import android.os.IBinder
import android.content.ServiceConnection
import android.os.PowerManager

class MainActivity : AppCompatActivity() {

    lateinit var button: Button

    var mHomeWatcher: HomeWatcher? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.botonRegalo)

        button.setOnClickListener {
            val intent = Intent(this, dos::class.java)
            startActivity(intent)
        }

        doBindService()
        val music = Intent()
        music.setClass(this, MusicService::class.java)
        startService(music)

        mHomeWatcher = HomeWatcher(this)
        mHomeWatcher!!.setOnHomePressedListener(object : HomeWatcher.OnHomePressedListener {
            override fun onHomePressed() {
                if (mServ != null) {
                    mServ!!.pauseMusic()
                }
            }

            override fun onHomeLongPressed() {
                if (mServ != null) {
                    mServ!!.pauseMusic()
                }
            }
        })
        mHomeWatcher!!.startWatch()

    }

    private var mIsBound = false
    private var mServ: MusicService? = null
    private val Scon = object : ServiceConnection {

        override fun onServiceConnected(name: ComponentName, binder: IBinder) {
            mServ = (binder as MusicService.ServiceBinder).service
        }

        override fun onServiceDisconnected(name: ComponentName) {
            mServ = null
        }
    }

    fun doBindService() {
        bindService(
            Intent(this, MusicService::class.java),
            Scon, Context.BIND_AUTO_CREATE
        )
        mIsBound = true
    }

    fun doUnbindService() {
        if (mIsBound) {
            unbindService(Scon)
            mIsBound = false
        }
    }

    override fun onResume() {
        super.onResume()

        if (mServ != null) {
            mServ!!.resumeMusic()
        }
    }

    override fun onPause() {
        super.onPause()

        val pm = getSystemService(Context.POWER_SERVICE) as PowerManager
        var isScreenOn = false
        if (pm != null) {
            isScreenOn = pm.isScreenOn
        }

        if (!isScreenOn) {
            if (mServ != null) {
                mServ!!.pauseMusic()
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()

        doUnbindService()
        val music = Intent()
        music.setClass(this, MusicService::class.java)
        stopService(music)

    }

}
