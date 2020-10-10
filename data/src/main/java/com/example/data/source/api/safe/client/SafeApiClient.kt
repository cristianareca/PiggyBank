package com.example.data.source.api.safe.client

import com.example.data.source.api.commons.SingleCallback
import com.example.data.source.api.safe.entity.SafeApiEntity
import io.reactivex.rxjava3.core.Single

class SafeApiClient(val apiService: SafeApiService) {

    fun getSafes(): Single<List<SafeApiEntity>> =
            Single.create<List<SafeApiEntity>> {
                val call = apiService.getAllSafes()
                val callback = SingleCallback<List<SafeApiEntity>>(it)

                call.enqueue(callback)
            }
}