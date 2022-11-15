package com.example.recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataClassContoh(
    val gambar: Int,
    val nama: String,
    val departemen: String,
    val angkatan: Int): Parcelable

// data class buat nandain item datanya
// buat bisa di pisahin per item pake parcelize dan parcelable, stepnya:
// 1. di build.gradle module plugin tambahin id 'kotlin-parcelize'
// 2. annotate @Parcelize
// 3. extend Parcelable