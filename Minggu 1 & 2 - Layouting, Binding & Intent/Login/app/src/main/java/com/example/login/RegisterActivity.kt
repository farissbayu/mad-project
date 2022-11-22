package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login.databinding.ActivityMainBinding
import com.example.login.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(binding.root)


        binding.arrow.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


        binding.button1register.setOnClickListener {
            val intent = Intent(this,ResultActivity::class.java)
            val massage1 = binding.Et1.text.toString()
            val massage2 = binding.Et2.text.toString()
            val massage3 = binding.Et3.text.toString()
            val massage4 = binding.Et4.text.toString()

            intent.putExtra("msg1", massage1)
            intent.putExtra("msg2", massage2)
            intent.putExtra("msg3", massage3)
            intent.putExtra("msg4", massage4)
            startActivity(intent)
        }
    }
}