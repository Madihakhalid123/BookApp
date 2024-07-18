package com.example.novelapp

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.novelapp.databinding.ActivityBookIntro1Binding

class Book_Intro1 : AppCompatActivity() {
    private lateinit var binding: ActivityBookIntro1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding=ActivityBookIntro1Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.nextIntro1.setOnClickListener {
            startActivity(Intent(this,Book_Intro2::class.java))

        }
        binding.backArrow.setOnClickListener(){
            finish()
        }
        binding.skipText.setOnClickListener(){
            startActivity(Intent(this,Book_Intro2::class.java))

        }
    }
}