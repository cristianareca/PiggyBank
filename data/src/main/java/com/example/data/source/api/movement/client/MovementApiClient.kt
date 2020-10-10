package com.example.data.source.api.movement.client

import com.example.data.source.api.commons.SingleCallback
import com.example.data.source.api.movement.entity.MovementApiEntity
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovementApiClient(val apiService: MovementApiService) {

    fun getMovements(): Single<List<MovementApiEntity>> =
            Single.create<List<MovementApiEntity>> {
               val call = apiService.getAllMovements()
                val callback = SingleCallback<List<MovementApiEntity>>(it)

                call.enqueue(callback)
            }
}