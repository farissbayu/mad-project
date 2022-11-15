package com.example.recyclerview

import android.text.Layout
import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class Adapter(
    private val data: MutableList<DataClassContoh>, // dataContoh dari MainActivity
    private val listener: (DataClassContoh) -> Unit // untuk ke detail
):RecyclerView.Adapter<Adapter.ViewHolder>() {
    // bikin inner class view holder, isinya variabel dari item adapter
    inner class ViewHolder(val v: View): RecyclerView.ViewHolder(v){
        val imageProfile = v.findViewById<ImageView>(R.id.iv_rv)
        val namaProfile = v.findViewById<TextView>(R.id.tv_nama_rv)
        val angkatanProfile = v.findViewById<TextView>(R.id.tv_angkatan_rv)
    }

    // ini buat nampilin item adapter dari recycler viewnya
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =  LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_adapter, parent, false)
        return ViewHolder(view)
    }

    // bind item itemnya ke view di item adapter
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = data[position]
        holder.imageProfile.setImageResource(list.gambar)
        holder.namaProfile.text = list.nama
        holder.angkatanProfile.text = list.angkatan.toString()
        holder.itemView.findViewById<ConstraintLayout>(R.id.item_adapter_layout).setOnClickListener{
            listener(data[position])
        }
    }

    // buat tau banyaknya data kita
    override fun getItemCount(): Int = data.size //banyak data
}