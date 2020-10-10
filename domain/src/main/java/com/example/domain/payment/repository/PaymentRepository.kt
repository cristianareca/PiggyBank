package com.example.domain.payment.repository

import com.example.domain.movement.model.Movement
import com.example.domain.payment.model.Payment
import io.reactivex.rxjava3.core.Single

interface PaymentRepository {
    fun getPayments(): Single<List<Payment>>
}