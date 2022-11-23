package com.example.emealstest

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileButton: ImageButton = findViewById(R.id.profile_btn)
        val postButton: ImageButton = findViewById(R.id.post_btn)

        val intent = Intent(this, ProfileActivity::class.java)

        profileButton.setOnClickListener {
            profileButton.isEnabled = false
            startActivity(intent)
        }



        }

    }
