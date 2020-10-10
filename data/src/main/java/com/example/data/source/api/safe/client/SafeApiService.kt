package com.example.data.source.api.safe.client

import com.example.data.source.api.safe.entity.SafeApiEntity
import retrofit2.Call
import retrofit2.http.GET

interface SafeApiService {
    @GET("/cristianareca/DBPiggybank/safes")
    fun getAllSafes(): Call<List<SafeApiEntity>>



}