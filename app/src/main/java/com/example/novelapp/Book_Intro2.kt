package com.example.novelapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.novelapp.databinding.ActivityBookIntro1Binding
import com.example.novelapp.databinding.ActivityBookIntro2Binding

class Book_Intro2 : AppCompatActivity() {
    private lateinit var binding: ActivityBookIntro2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityBookIntro2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.nextIntro2.setOnClickListener {
            startActivity(Intent(this,Book_Intro3::class.java))

        }
        binding.backArrow.setOnClickListener(){
            finish()
        }
        binding.skipText.setOnClickListener(){
            startActivity(Intent(this,Book_Intro3::class.java))

        }

        }
    }
