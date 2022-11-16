package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import javax.xml.transform.ErrorListener

class Adapter (
    private val data: MutableList<DataClass>,
    private val listener: (DataClass) -> Unit
    //data contoh dari MainActivity


): RecyclerView.Adapter<Adapter.ViewHolder>() {
    inner class ViewHolder(val v: View): RecyclerView.ViewHolder(v) {
        //item yang ingin ditampilin
        val imageProfile = v.findViewById<ImageView>(R.id.img_item_photo)
        val namaProfile = v.findViewById<TextView>(R.id.tv_item_name)
        val detailProfile = v.findViewById<TextView>(R.id.tv_item_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context)
           .inflate(R.layout.item_adapter, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = data[position]
        holder.imageProfile.setImageResource(list.photo)
        holder.namaProfile.text = list.name
        holder.detailProfile.text = list.detail
        holder.itemView.findViewById<LinearLayout>(R.id.item_adapter_layout).setOnClickListener{
            listener(data[position])
        }

    }

    override fun getItemCount(): Int {
        //banyak data
        return data.size
    }
}