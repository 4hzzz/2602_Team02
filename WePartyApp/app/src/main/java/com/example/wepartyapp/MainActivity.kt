package com.example.wepartyapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.wepartyapp.ui.auth.SplashActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Immediately launch the real app entry point
        val intent = Intent(this, SplashActivity::class.java)
        startActivity(intent)

        // Close this activity so it doesn't stay in the back stack
        finish()
    }
}