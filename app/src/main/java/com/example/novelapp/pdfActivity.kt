package com.example.novelapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.novelapp.databinding.ActivityPdfBinding

class pdfActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPdfBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityPdfBinding.inflate(layoutInflater)


        setContentView(binding.root)

        window.addFlags(
            WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON or
                    WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        supportActionBar?.hide()
       val pdf=intent.getStringExtra("Book_pdf").toString()
binding.pdfView.fromAsset(pdf)

    .enableSwipe(true)

    
    .enableDoubletap(true)
    .defaultPage(0)
    .load()


    }
}