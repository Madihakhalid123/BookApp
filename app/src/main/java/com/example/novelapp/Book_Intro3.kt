package com.example.novelapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.novelapp.databinding.ActivityBookIntro3Binding

class Book_Intro3 : AppCompatActivity() {
    private lateinit var binding: ActivityBookIntro3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBookIntro3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.nextIntro3.setOnClickListener {
            startActivity(Intent(this,login_Activity::class.java))
            finish()
        }
        binding.backArrow.setOnClickListener(){
            finish()
        }
        binding.skipText.setOnClickListener(){
            startActivity(Intent(this,login_Activity::class.java))

        }
    }
}