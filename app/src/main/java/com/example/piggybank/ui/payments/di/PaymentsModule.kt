package com.example.piggybank.ui.payments.di

import com.example.data.repository.payment.PaymentRepositoryImpl
import com.example.domain.payment.usecase.GetPaymentUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PaymentsModule {
    @Singleton
    @Provides

    internal fun provideGetPaymentsUseCase(paymentRepositoryImpl: PaymentRepositoryImpl
    ) = GetPaymentUseCase(paymentRepositoryImpl)
}