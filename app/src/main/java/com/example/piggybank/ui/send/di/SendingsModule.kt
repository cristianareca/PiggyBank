package com.example.piggybank.ui.send.di

import com.example.data.repository.movement.MovementRepositoryImpl
import com.example.data.repository.sending.SendingRepositoryImpl
import com.example.domain.movement.usecase.GetMovementsUseCase
import com.example.domain.send.usecase.GetSendingsUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SendingsModule {
    @Singleton
    @Provides

    internal fun provideGetSendingsUseCase(sendingRepositoryImpl: SendingRepositoryImpl
    ) = GetSendingsUseCase(sendingRepositoryImpl)
}