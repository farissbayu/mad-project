package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // menerima data dari activity dengan key yang di oper adalah "contoh"
        val detail = intent.getParcelableExtra<DataClass>("contoh",)

        // deklarasi variabel untuk menampilkan detail
        val imageDetail = findViewById<ImageView>(R.id.img_universitas)
        val namaDetail = findViewById<TextView>(R.id.tv_namaUniv)
        val detailDetail = findViewById<TextView>(R.id.tv_detail_ui)
        val alamatDetail = findViewById<TextView>(R.id.tv_alamat)
        val telephonDetail = findViewById<TextView>(R.id.tv_nomor)

        // bind item item ke variabel yang akan ditampilkan
        if(detail != null){
            imageDetail.setImageResource(detail.photo)
            namaDetail.text = detail.name
            detailDetail.text = detail.detail
            alamatDetail.text = detail.alamat
            telephonDetail.text = detail.telephone
            supportActionBar?.title = detail.name

            //untuk menambahkan toast ketika tombol favorit di click
            val favorit: Button = findViewById(R.id.btn_set_favorite)
            favorit.setOnClickListener{
                Toast.makeText(this,  "kamu menambahkan ${detail.name} ke daftar favorit", Toast.LENGTH_SHORT).show()
            }

            //untuk menshare ketika tombol share di click
            val share : Button = findViewById(R.id.action_share)
            share.setOnClickListener{
                val intent = Intent(Intent.ACTION_SEND)
                intent.setType("image/jpeg");
                intent.putExtra("send", detail.photo)
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                startActivity(Intent.createChooser(intent, "Send"));
            }

        }


}
}