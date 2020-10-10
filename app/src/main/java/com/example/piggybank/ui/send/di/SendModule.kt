package com.example.piggybank.ui.send.di

import com.example.data.repository.send.SendRepositoryImpl
import com.example.domain.send.usecase.GetSendsUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SendModule {
    @Singleton
    @Provides

    internal fun provideGetSendsUseCase(sendRepositoryImpl: SendRepositoryImpl
    ) = GetSendsUseCase(sendRepositoryImpl)
}