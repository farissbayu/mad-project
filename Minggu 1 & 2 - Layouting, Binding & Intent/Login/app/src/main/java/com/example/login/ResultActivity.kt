package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login.databinding.ActivityMainBinding
import com.example.login.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(binding.root)

        binding.arrow.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val teks1 = intent.getStringExtra("msg1")
        val teks2 = intent.getStringExtra("msg2")
        val teks3 = intent.getStringExtra("msg3")
        val teks4 = intent.getStringExtra("msg4")

        binding.Et1.text = teks1
        binding.Et2.text = teks2
        binding.Et3.text = teks3
        binding.Et4.text = teks4

    }
}