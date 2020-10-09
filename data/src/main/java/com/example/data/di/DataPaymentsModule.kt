package com.example.data.di


import com.example.data.repository.payment.PaymentRepositoryImpl
import com.example.data.source.api.payment.client.PaymentApiClient
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [DataSourceApiModule::class])

class DataPaymentsModule {

    @Singleton
    @Provides
    internal fun providePaymentsRepository(
            paymentApiClient: PaymentApiClient
    ) = PaymentRepositoryImpl(paymentApiClient)

}
