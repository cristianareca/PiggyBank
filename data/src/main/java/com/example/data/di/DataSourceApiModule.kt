package com.example.data.di


import com.example.data.source.api.Movement.client.MovementApiClient
import dagger.Module
import dagger.Provides

import javax.inject.Named
import javax.inject.Singleton

@Module
class DataSourceApiModule {


    @Singleton
    @Provides
    internal fun provideMovementApiClient() = MovementApiClient()



}