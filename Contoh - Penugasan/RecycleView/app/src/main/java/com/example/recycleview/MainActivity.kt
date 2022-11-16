package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //mengganti judul
        supportActionBar?.title = "University"

        val recyclerView = findViewById<RecyclerView>(R.id.rv_layout)

        val dataContoh = mutableListOf<DataClass>(
            DataClass(R.drawable.ui, "Universitas Indonesia", resources.getString(R.string.UI) , "Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424", "(021) 7867222" ),
            DataClass(R.drawable.ipb, "Institut Pertanian Bogor", resources.getString(R.string.IPB) , "Jl. Raya Dramaga Kampus IPB Dramaga Bogor 16680 West Java, Indonesia",  "+62 251 8622642"),
            DataClass(R.drawable.itb, "Institut Teknologi Bandung", resources.getString(R.string.ITB) , "Jl. Ganesa No.10, Lb. Siliwangi, Kecamatan Coblong, Kota Bandung, Jawa Barat 40132", "(022) 2500935"),
            DataClass(R.drawable.ugm, "Universitas Gajah Mada", resources.getString(R.string.UGM) , "Bulaksumur, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281", "(0274) 588688"),
            DataClass(R.drawable.unand, "Universitas Andalas", resources.getString(R.string.Unand) ,"Limau Manis, Kec. Pauh, Kota Padang, Sumatera Barat 25175", "(0751) 71181"),
            DataClass(R.drawable.upi, "Universitas Pendidikan Indonesia", resources.getString(R.string.UPI) ,  "Jl. Dr. Setiabudi No.229, Isola, Kec. Sukasari, Kota Bandung, Jawa Barat 40154", "(022) 2013163"),
            DataClass(R.drawable.undip, "Universitas Diponogoro", resources.getString(R.string.Undip), "Jl. Prof. Sudarto No.13, Tembalang, Kec. Tembalang, Kota Semarang, Jawa Tengah 50275", "(024) 7460036"),
            DataClass(R.drawable.unpad, "Universitas Padjajaran", resources.getString(R.string.Unpad),  "Jl. Raya Bandung Sumedang KM.21, Hegarmanah, Kec. Jatinangor, Kabupaten Sumedang, Jawa Barat 45363", "(022) 84288828"),
            DataClass(R.drawable.unp, "Universitas Negeri Padang", resources.getString(R.string.UNP) , "Jalan Prof Dr Hamka Kampus Air TawarPadangSumatera Barat", "0751 7058692"),
            DataClass(R.drawable.hasanuddin, "Universitas Hassanudding", resources.getString(R.string.Unhas) , "Jl. Perintis Kemerdekaan No.KM.10, Tamalanrea Indah, Kec. Tamalanrea, Kota Makassar, Sulawesi Selatan 90245","0811-5003-636" ),
            DataClass(R.drawable.unibraw, "Universitas Brawijaya", resources.getString(R.string.Unbraw) ,"Jl. Abdul Muis No.52, RT.2/RW.3, Petojo Sel., Kecamatan Gambir, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10160", "+62-341-551611"),
        )

        //manggil prgram adapter
        val adapter = Adapter(dataContoh){
            //bikin intent ke activty
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("contoh", it)
                startActivity(this)
            }
        }
        // layout manager buat atur layout dari recycler viewnya, horizontal atau vertikal
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
    }
}