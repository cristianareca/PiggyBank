package com.example.domain.payment.usecase

import com.example.domain.movement.repository.MovementRepository
import com.example.domain.payment.repository.PaymentRepository
import io.reactivex.rxjava3.schedulers.Schedulers

class GetPaymentUseCase(private val paymentRepository: PaymentRepository ){
    fun execute() = paymentRepository.getPayments()
            .subscribeOn(Schedulers.io())
}