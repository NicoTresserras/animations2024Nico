package com.example.animations2024

import android.os.Bundle
import android.animation.ObjectAnimator
import android.animation.AnimatorSet
import android.content.Intent
import android.os.Handler
import android.os.Looper

import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.animations2024.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var animation = AnimationUtils.loadAnimation(applicationContext, R.anim.primera_animacio)
        val animationSet = AnimationSet(false)
        animationSet.addAnimation(animation)
        var animation2 = AnimationUtils.loadAnimation(applicationContext, R.anim.segona_animacio)
        animation2.startOffset = animation2.duration
        animationSet.addAnimation(animation2)
        var animation3 = AnimationUtils.loadAnimation(applicationContext, R.anim.tercera_animacio)
        animation3.startOffset = animation2.duration + animation2.startOffset
        animationSet.addAnimation(animation3)
        var animation4 = AnimationUtils.loadAnimation(applicationContext, R.anim.quarta_animacio)
        animation4.startOffset = animation3.duration + animation3.startOffset
        animationSet.addAnimation(animation4)
        var animation5 = AnimationUtils.loadAnimation(applicationContext, R.anim.cinquena_animacio)
        animation5.startOffset = animation4.duration + animation4.startOffset
        animationSet.addAnimation(animation5)
        var animation6 = AnimationUtils.loadAnimation(applicationContext, R.anim.sisena_animacio)
        animation6.startOffset = animation5.duration + animation5.startOffset
        animationSet.addAnimation(animation6)

        animationSet.fillAfter = true
        binding.bola.startAnimation(animationSet)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SplashScreen::class.java)
            startActivity(intent)
            finish()
            // Time in milliseconds
        }, animation6.startOffset + animation6.duration)
        }
    }