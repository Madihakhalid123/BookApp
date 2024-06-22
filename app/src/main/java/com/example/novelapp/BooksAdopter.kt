package com.example.novelapp

import android.content.Context
import android.content.Intent
import android.telecom.Call.Details
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView

class BooksAdopter(val list:ArrayList<bookmodel>,val context:Context):RecyclerView.Adapter<BooksAdopter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.home_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

val image=itemView.findViewById<ImageView>(R.id.imageView)
        val cardview=itemView.findViewById<MaterialCardView>(R.id.CardView)



        fun bind(modelbook: bookmodel) {

image.setImageResource(modelbook.image)
            cardview.setOnClickListener(){
                val intent=Intent()
                //putextra method ka use data ko ak activity sy dusri activity my pass krny ky liy use hota ha
                intent.putExtra("Book_title",modelbook.title)
           intent.putExtra("Book_image",modelbook.image)
           intent.putExtra("Book_description",modelbook.discription)
           intent.putExtra("Book_pdf",modelbook.bookpdf)
               intent.setClass(context,bokdetails::class.java)
                context.startActivity(intent)



            }

        }
    }
}