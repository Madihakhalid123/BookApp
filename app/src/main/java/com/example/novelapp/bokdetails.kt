package com.example.novelapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.novelapp.databinding.ActivityBokdetailsBinding

class bokdetails : AppCompatActivity() {
    private lateinit var binding: ActivityBokdetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityBokdetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
val booktitle=intent.getStringExtra("Book_title").toString()
val bookimage=intent.getIntExtra("Book_image",0)
val bookdes=intent.getStringExtra("Book_description").toString()
val bookpdf=intent.getStringExtra("Book_pdf").toString()
        binding.booktitle.text=booktitle
        binding.discription.text=bookdes

       binding.bookimage.setImageResource(bookimage)
        binding.readbook.setOnClickListener(){
            val intent=Intent()
            intent.putExtra("Pdf_book",bookpdf)
            intent.setClass(this,pdfActivity::class.java)
            startActivity(intent)
        }

    }
}