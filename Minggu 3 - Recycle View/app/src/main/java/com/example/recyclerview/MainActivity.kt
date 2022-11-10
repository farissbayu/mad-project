package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_layout) // definisi variabel recycler view

        val dataContoh = mutableListOf<DataClassContoh>(
            DataClassContoh(R.drawable.gambar_1, "Faris", "Ilkom", 57),
            DataClassContoh(R.drawable.gambar_2, "Dapbis", "Kedokteran", 61),
            DataClassContoh(R.drawable.gambar_1, "Faris", "Ilkom", 57),
            DataClassContoh(R.drawable.gambar_2, "Dapbis", "Kedokteran", 61),
            DataClassContoh(R.drawable.gambar_1, "Faris", "Ilkom", 57),
            DataClassContoh(R.drawable.gambar_2, "Dapbis", "Kedokteran", 61),
            DataClassContoh(R.drawable.gambar_1, "Faris", "Ilkom", 57),
            DataClassContoh(R.drawable.gambar_2, "Dapbis", "Kedokteran", 61),
            DataClassContoh(R.drawable.gambar_1, "Faris", "Ilkom", 57),
            DataClassContoh(R.drawable.gambar_2, "Dapbis", "Kedokteran", 61),
            DataClassContoh(R.drawable.gambar_1, "Faris", "Ilkom", 57),
            DataClassContoh(R.drawable.gambar_2, "Dapbis", "Kedokteran", 61),
            DataClassContoh(R.drawable.gambar_1, "Faris", "Ilkom", 57),
            DataClassContoh(R.drawable.gambar_2, "Dapbis", "Kedokteran", 61),
            DataClassContoh(R.drawable.gambar_1, "Faris", "Ilkom", 57),
            DataClassContoh(R.drawable.gambar_2, "Dapbis", "Kedokteran", 61),
            DataClassContoh(R.drawable.gambar_1, "Faris", "Ilkom", 57),
            DataClassContoh(R.drawable.gambar_2, "Dapbis", "Kedokteran", 61),
            DataClassContoh(R.drawable.gambar_1, "Faris", "Ilkom", 57),
            DataClassContoh(R.drawable.gambar_2, "Dapbis", "Kedokteran", 61)

        )

        // manggil program adapter
        val adapter = Adapter(dataContoh){
            // bikin intent buat ke activity detail
            val intent = Intent(this, Detail::class.java).apply {
                // putExtra buat ngirim data ke activity detail
                putExtra("contoh", it)
                startActivity(this)
            }
        }

        // layout manager buat atur layout dari recycler viewnya, horizontal atau vertikal
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter

    }
}