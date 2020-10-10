package com.example.data.source.api.obligation.client

import com.example.data.source.api.obligation.entity.ObligationApiEntity
import retrofit2.Call
import retrofit2.http.GET

interface ObligationApiService {
    @GET("/cristianareca/DBPiggybank/obligation")
    fun getAllObligations(): Call<List<ObligationApiEntity>>



}