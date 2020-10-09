package com.example.data.source.api.payment.client

import com.example.data.source.api.payment.entity.PaymentApiEntity
import retrofit2.Call
import retrofit2.http.GET


interface PaymentApiService {
    @GET("/cristianareca/DBPiggybank/payments")
    fun getAllPayments(): Call<List<PaymentApiEntity>>



}