package com.example.piggybank.ui.movements.di

import com.example.data.repository.movement.MovementRepositoryImpl
import com.example.domain.movement.usecase.GetMovementsUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MovementsModule {
    @Singleton
    @Provides

    internal fun provideGetMovementsUseCase(obligationRepositoryImpl: MovementRepositoryImpl
    ) = GetMovementsUseCase(obligationRepositoryImpl)
}