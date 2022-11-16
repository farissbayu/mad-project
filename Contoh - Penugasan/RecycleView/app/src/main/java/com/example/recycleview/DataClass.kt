package com.example.recycleview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataClass(
    var photo : Int = 0,
    var name: String = "",
    var detail: String = "",
    var alamat: String = "",
    var telephone: String = ""
    ): Parcelable