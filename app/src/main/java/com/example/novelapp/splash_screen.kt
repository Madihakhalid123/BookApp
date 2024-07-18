package com.example.novelapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.novelapp.databinding.ActivityBookIntro1Binding
import com.example.novelapp.databinding.ActivitySplashScreenBinding

class splash_screen : AppCompatActivity() {
    private lateinit var binding:ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
       Handler(Looper.getMainLooper()).postDelayed({
           startActivity(Intent(this,Book_Intro1::class.java))

       },3000)
    }
}