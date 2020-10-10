package com.example.data.source.api.send.client

import com.example.data.source.api.send.entity.SendApiEntity
import retrofit2.Call
import retrofit2.http.GET

interface SendApiService {
    @GET("/cristianareca/DBPiggybank/send")
    fun getAllSends(): Call<List<SendApiEntity>>
}