package com.example.skincare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)

        val edit:Button = findViewById(R.id.editProfileButton)
        val reminder:Switch = findViewById(R.id.reminderSwitch)
        val notification:Switch = findViewById(R.id.notificationSwitch)
        val change:Button = findViewById(R.id.changeLanguageButton)

        edit.setOnClickListener {
            startActivity(Intent(this,Profile::class.java))
        }
    }
}