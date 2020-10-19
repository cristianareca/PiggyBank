package com.example.data.source.api.obligation.client

import com.example.data.source.api.commons.SingleCallback
import com.example.data.source.api.obligation.entity.ObligationApiEntity
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ObligationApiClient(val apiService: ObligationApiService) {

    fun getObligations(): Single<List<ObligationApiEntity>> =
            Single.create<List<ObligationApiEntity>> {
               val call = apiService.getAllObligations()
                val callback = SingleCallback<List<ObligationApiEntity>>(it)

                call.enqueue(callback)
            }
}