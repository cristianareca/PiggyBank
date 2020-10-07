package com.example.data.source.api.movement.client

import com.example.data.source.api.movement.entity.MovementApiEntity
import retrofit2.Call
import retrofit2.http.GET

interface MovementApiService {
    @GET("/movements")
    fun getAllMovements(): Call<List<MovementApiEntity>>



}