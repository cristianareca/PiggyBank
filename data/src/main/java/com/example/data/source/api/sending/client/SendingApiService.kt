package com.example.data.source.api.sending.client

import com.example.data.source.api.sending.entity.SendingApiEntity
import retrofit2.Call
import retrofit2.http.GET

interface SendingApiService {
    @GET("/cristianareca/DBPiggybank/sending")
    fun getAllSendings(): Call<List<SendingApiEntity>>


}