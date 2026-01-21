package com.example.skincare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val skincaretips:Button = findViewById(R.id.btnSkincareTips)
        val settings:Button = findViewById(R.id.btnsettings)
        val routine:Button = findViewById(R.id.btnRoutineTracker)
        val welcomeText: TextView = findViewById(R.id.welcomeText)
        skincaretips.setOnClickListener {
            startActivity(Intent(this,SkinTips::class.java))
        }
        settings.setOnClickListener {
            startActivity(Intent(this,Settings::class.java))
        }
        routine.setOnClickListener {
            startActivity(Intent(this,Rutine::class.java))
        }
    }
}