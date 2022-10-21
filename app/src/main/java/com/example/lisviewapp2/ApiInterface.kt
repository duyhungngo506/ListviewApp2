package com.example.lisviewapp2

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("user")
    fun getData():Call<List<MyDataItem>>
}