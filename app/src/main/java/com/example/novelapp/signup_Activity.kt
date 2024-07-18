package com.example.novelapp

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.novelapp.databinding.ActivitySignupBinding
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import java.util.regex.Pattern

class signup_Activity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    var db=Firebase.firestore
    private lateinit var dialog: Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.signupBtn.setOnClickListener() {
            loadingAnimation()
            var name = binding.name.text.toString()
            var Mail = binding.mail.text.toString()
            var password = binding.pass.text.toString()
            var cpass = binding.confirmpass.text.toString()
            if (name.isEmpty()) {
                binding.name.error = "Username is required"
                closeAnimation()
            } else if (Mail.isEmpty()) {
                binding.mail.error = "Email is required"

                closeAnimation()
            } else if (password.isEmpty()) {
                binding.pass.error = "Email is required"
                closeAnimation()
            } else if (cpass.isEmpty()) {
                binding.pass.error = "confirm password is required"
                closeAnimation()
            } else {
                var model = usermodel()
                model.username = name
                model.Email = Mail
                model.password = password
                model.confirmpassword = cpass
                db.collection("user").add(model).addOnSuccessListener { doc ->
                    model.userid = doc.id
                    db.collection("user").document(doc.id).set(model)
                        .addOnSuccessListener {

                            Toast.makeText(this, "signupsuccessful", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this, login_Activity::class.java))
                            finish()
                        }
                        .addOnFailureListener() {
                            Toast.makeText(this, "faliure", Toast.LENGTH_SHORT).show()
                            closeAnimation()
                        }

                }
                    .addOnFailureListener() {
                        closeAnimation()
                        Toast.makeText(this, "faliure", Toast.LENGTH_SHORT).show()
                    }
            }
        }
    } fun loadingAnimation(){
       dialog=Dialog(this)
        dialog.setContentView(R.layout.loading_anim)
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog.show()

    }
fun closeAnimation(){
dialog.dismiss()
}}