package com.example.data.repository.payment

import com.example.data.source.api.payment.client.PaymentApiClient
import com.example.data.source.api.payment.entity.mapToDomain
import com.example.domain.payment.model.Payment
import com.example.domain.payment.repository.PaymentRepository
import io.reactivex.rxjava3.core.Single

class PaymentRepositoryImpl(private val paymentApiClient: PaymentApiClient) : PaymentRepository {

    override fun getPayments(): Single<List<Payment>> =
            paymentApiClient.getPayments()
                    .map {
                        it.mapToDomain()
                    }

}