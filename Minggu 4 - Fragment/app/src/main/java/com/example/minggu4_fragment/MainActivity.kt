package com.example.minggu4_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btn1 = findViewById<Button>(R.id.btn_fragment_1)
        val btn2 = findViewById<Button>(R.id.btn_fragment_2)

        btn1.setOnClickListener {
            gantiFragment(Fragment1())
        }
        btn2.setOnClickListener {
            gantiFragment(Fragment2())
        }

    }

    fun gantiFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}