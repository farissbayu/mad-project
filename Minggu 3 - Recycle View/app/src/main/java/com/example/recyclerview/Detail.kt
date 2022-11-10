package com.example.recyclerview

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // nerima data dari activity dengan key yang di oper adalah "contoh"
        val detail = intent.getParcelableExtra<DataClassContoh>("contoh",)

        // deklarasi variabel untuk menampilkan detail
        val imageDetail = findViewById<ImageView>(R.id.iv_detail)
        val namaDetail = findViewById<TextView>(R.id.tv_detail_nama)
        val departemenDetail = findViewById<TextView>(R.id.tv_detail_departemen)
        val angkatanDetail = findViewById<TextView>(R.id.tv_detail_angkatan)

        // bind item item ke variabel yang akan ditampilkan
        if(detail != null){
            imageDetail.setImageResource(detail.gambar)
            namaDetail.text = "Nama : ${detail.nama}"
            departemenDetail.text = "Departemen : ${detail.departemen}"
            angkatanDetail.text = "Angkatan : ${ detail.angkatan}"
        }
    }
}