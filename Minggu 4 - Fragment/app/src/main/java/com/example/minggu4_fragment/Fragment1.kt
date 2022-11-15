package com.example.minggu4_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_1, container, false)
        val et1 = view.findViewById<EditText>(R.id.et_fragment_1)
        val btn1 = view.findViewById<Button>(R.id.btn_show_1)
        btn1.setOnClickListener {
            Toast.makeText(context, et1.text, Toast.LENGTH_SHORT).show()
        }
        return  view
    }
}