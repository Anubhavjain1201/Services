package com.example.learningservices

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.start)
        val stopButton = findViewById<Button>(R.id.stop)

        startButton.setOnClickListener {
            startService(Intent(this, MyService::class.java))
        }

        stopButton.setOnClickListener {
            stopService(Intent(this, MyService::class.java))
        }
    }
}