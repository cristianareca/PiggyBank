package com.example.piggybank.ui.safe.di

import com.example.data.repository.safe.SafeRepositoryImpl
import com.example.domain.safe.usecase.GetSafesUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SafesModule {
    @Singleton
    @Provides

    internal fun provideGetSafesUseCase(safeRepositoryImpl: SafeRepositoryImpl
    ) = GetSafesUseCase(safeRepositoryImpl)
}