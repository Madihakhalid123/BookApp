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

list.add(bookmodel(R.drawable.img,"Yaariyan","\"Yaariyan\" is a heartfelt tale of five friends navigating life's challenges and joys in modern-day India. Bound by deep bonds of friendship, they discover the true meaning of love, loyalty, and staying true to themselves as they face the trials of adulthood together.\n" +
        "\n","yaria.pdf"))
 list.add(bookmodel(R.drawable.img_1,"Jannart ky patty","The novel follows the journey of Haya, a young girl who is struggling to find her way in life. She is torn between her love for her family and her desire to pursue her dreams. When she receives a scholarship to study in Turkey, she jumps at the opportunity to explore a new world and discover herself.","jant.pdf"))
 list.add(bookmodel(R.drawable.img_2,"Peer-e-Kamil","Peer-e-Kamil is a story focusing on a deviational sect which violates the finality of our Prophet (P.B.U.H) meanwhile, narrating a heart wrenching journey of two unhappy souls; Salaar Sikandar, a genius with an outstanding I.Q who has complicated queries about life and Imama Hashim, an ordinary girl with a stable family. Both are poles apart in terms of spiritual awakening. Destiny maneuvers their lives to cross each other’s paths, until Salaar falls in love with Imama after facing a horrifying experience that totally changes the course of his life.","peerkamil.pdf"))
 list.add(bookmodel(R.drawable.img_5,"La Hasil","La Hasil is a sublime tale of individuals who faced different trials in life. Driven by desire, belief, pride and prejudice, they run their lives according to their views. Khadija Noor, the centre stage character is the epitome of belief, patience and self-sacrifice","lahasil.pdf"))
 list.add(bookmodel(R.drawable.img_4,"Sulphite","Sulphite is not merely a novel; it is an exploration of the human condition, a journey through the complexities of life, and a celebration of the art of storytelling. Noor Rajpoot has not only penned a captivating tale but has also crafted a work that invites introspection and contemplation","sulphite.pdf"))
 list.add(bookmodel(R.drawable.img_3,"Main Anmol","The book is as precious as its name indicates \"Main Anmol\". This title gives you a sense of self-worth, and makes you think that how much different and unique you're in your own way. This is one of the great self-help book, and the author has done her best to help you in your spiritual as well as psychological journey to your true-self","maanmol.pdf"))
 list.add(bookmodel(R.drawable.img_6,"Haalim","The word Haalim is an Arabic word and it means “A Dreamer”. It’s a long novel with episodes and each episode will have a separate title.\n" +
         "Its the most different and unique thing I have ever written, or has ever been written in Khawateen Digest.","halim.pdf"))
 list.add(bookmodel(R.drawable.img_7,"Dua E Mairaaj","\"Dua-e-Meraj\" is a touching tale that inspires readers to reflect on their own spiritual journeys and the transformative power of love and faith.","dua.pdf"))
        recyclerView.layoutManager= GridLayoutManager(this,2)
        recyclerView.adapter=BooksAdopter(list,this)

    }
}