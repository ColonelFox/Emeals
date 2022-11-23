package com.example.emealstest

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class ProfileActivity : AppCompatActivity(){
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.profile_activity)

            val auth = FirebaseAuth.getInstance()

            val homeButton: ImageButton = findViewById(R.id.profile_home_btn)
            val postButton: ImageButton = findViewById(R.id.profile_post_btn)
            val logoutButton: ImageButton = findViewById(R.id.profile_logout_btn)

            val intent = Intent(this, MainActivity::class.java)
            val intent1 = Intent(this, LoginActivity::class.java)


            homeButton.setOnClickListener {
                homeButton.isEnabled = false
                startActivity(intent)
            }

            logoutButton.setOnClickListener {
                auth.signOut()
                startActivity(intent1)
            }
        }
}