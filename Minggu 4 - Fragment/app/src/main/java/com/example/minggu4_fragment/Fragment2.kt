package com.example.minggu4_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_2, container, false)
        val et2 = view.findViewById<EditText>(R.id.et_fragment_2)
        val tv2 = view.findViewById<TextView>(R.id.tv_fragment_2)
        val btn2 = view.findViewById<Button>(R.id.btn_show_2)
        btn2.setOnClickListener {
            et2.visibility = View.GONE
            tv2.text = et2.text
            tv2.visibility = View.VISIBLE
        }
        return view
    }
}