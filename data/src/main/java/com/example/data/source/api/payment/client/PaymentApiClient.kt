package com.example.data.source.api.payment.client

import com.example.data.source.api.commons.SingleCallback
import com.example.data.source.api.payment.entity.PaymentApiEntity
import io.reactivex.rxjava3.core.Single
class PaymentApiClient(val apiService: PaymentApiService) {

    fun getPayments(): Single<List<PaymentApiEntity>> =
            Single.create<List<PaymentApiEntity>> {
                val call = apiService.getAllPayments()
                val callback = SingleCallback<List<PaymentApiEntity>>(it)

                call.enqueue(callback)
            }
}