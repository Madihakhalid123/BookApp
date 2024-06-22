package com.example.novelapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.novelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
   private lateinit var recyclerView: RecyclerView
   val list:ArrayList<bookmodel> =ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerView=binding.recyclerView

list.add(bookmodel(R.drawable.img,"gyut","hjhf","shufus"))
 list.add(bookmodel(R.drawable.img_1,"gyut","hjhf","shufus"))
 list.add(bookmodel(R.drawable.img_2,"gyut","hjhf","shufus"))
 list.add(bookmodel(R.drawable.img_5,"gyut","hjhf","shufus"))
 list.add(bookmodel(R.drawable.img_4,"gyut","hjhf","shufus"))
 list.add(bookmodel(R.drawable.img_3,"gyut","hjhf","shufus"))
 list.add(bookmodel(R.drawable.img_6,"gyut","hjhf","shufus"))
 list.add(bookmodel(R.drawable.img_7,"gyut","hjhf","shufus"))
        recyclerView.layoutManager= GridLayoutManager(this,2)
        recyclerView.adapter=BooksAdopter(list,this)

    }
}