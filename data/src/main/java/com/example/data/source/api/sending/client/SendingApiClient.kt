package com.example.data.source.api.sending.client

import com.example.data.source.api.commons.SingleCallback
import com.example.data.source.api.sending.entity.SendingApiEntity
import io.reactivex.rxjava3.core.Single

class SendingApiClient(val apiService: SendingApiService) {

    fun getSendings(): Single<List<SendingApiEntity>> =
            Single.create<List<SendingApiEntity>> {
               val call = apiService.getAllSendings()
                val callback = SingleCallback<List<SendingApiEntity>>(it)

                call.enqueue(callback)
            }
}