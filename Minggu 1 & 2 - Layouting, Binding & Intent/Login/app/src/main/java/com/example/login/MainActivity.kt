package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.login.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var buttonRegister : Button

    lateinit var binding: ActivityMainBinding

    private fun initcomponents(){
        buttonRegister = findViewById(R.id.button2)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initcomponents()

        binding.button2.setOnClickListener {
            startActivity(Intent(this@MainActivity,RegisterActivity::class.java))
        }

    }

}