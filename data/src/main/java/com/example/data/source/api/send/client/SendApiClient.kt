package com.example.data.source.api.send.client

import com.example.data.source.api.commons.SingleCallback
import com.example.data.source.api.send.entity.SendApiEntity
import io.reactivex.rxjava3.core.Single

class SendApiClient(val apiService: SendApiService) {

    fun getSends(): Single<List<SendApiEntity>> =
            Single.create<List<SendApiEntity>> {
               val call = apiService.getAllSends()
                val callback = SingleCallback<List<SendApiEntity>>(it)

                call.enqueue(callback)
            }
}