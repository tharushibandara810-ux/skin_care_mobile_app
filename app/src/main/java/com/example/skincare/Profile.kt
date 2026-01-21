package com.example.skincare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val username: TextView = findViewById(R.id.pUserName)
        val email: TextView = findViewById(R.id.PEmail)
        val logout: Button = findViewById(R.id.btnLogout)

        logout.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
    }
}
