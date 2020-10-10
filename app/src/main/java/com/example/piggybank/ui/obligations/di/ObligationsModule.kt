package com.example.piggybank.ui.obligations.di

import com.example.data.repository.obligation.ObligationRepositoryImpl
import com.example.domain.obligation.usecase.GetObligationUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ObligationsModule {
    @Singleton
    @Provides

    internal fun provideGetObligationUseCase(obligationRepositoryImpl: ObligationRepositoryImpl
    ) = GetObligationUseCase(obligationRepositoryImpl)
}