package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        val univ = findViewById<Button>(R.id.btn_set_universitry)
        val profile = findViewById<Button>(R.id.btn_set_profile)

        univ.setOnClickListener{
            val inten = Intent(this, MainActivity::class.java)
            startActivity(inten)
        }

        profile.setOnClickListener{
            val inten = Intent(this, Profile::class.java)
            startActivity(inten)
        }
    }
}