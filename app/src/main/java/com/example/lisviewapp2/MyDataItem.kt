package com.example.lisviewapp2

import com.google.gson.annotations.SerializedName

data class MyDataItem(
    val address: String,
    val avatar: String,
    @SerializedName("fullname")
    val fullName: String,
    val id: String,
    val phone: String
)