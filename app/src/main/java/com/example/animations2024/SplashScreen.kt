package com.example.animations2024

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.animations2024.databinding.ActivityMainBinding
import com.example.animations2024.databinding.ActivitySplashScreenBinding


class SplashScreen : AppCompatActivity() {
    lateinit var binding : ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Hide action bar
        supportActionBar?.hide()

        binding.bola.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
                // Time in milliseconds
            }, 2100)
        }
        // Splashscreen delay

    }
}