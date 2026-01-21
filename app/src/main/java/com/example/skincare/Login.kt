package com.example.skincare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val usernameInput: EditText = findViewById(R.id.LUserName)
        val passwordInput: EditText = findViewById(R.id.LPassword)

        val loginbutton: Button = findViewById(R.id.btnLogin)
        val registerbutton: Button = findViewById(R.id.btnRegister)

        registerbutton.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
        loginbutton.setOnClickListener {
            startActivity(Intent(this,Home::class.java))
        }
    }
}