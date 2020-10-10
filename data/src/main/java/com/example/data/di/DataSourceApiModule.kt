package com.example.data.di


import com.example.data.source.api.movement.client.MovementApiClient
import com.example.data.source.api.movement.client.MovementApiService
import com.example.data.source.api.obligation.client.ObligationApiClient
import com.example.data.source.api.obligation.client.ObligationApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

import javax.inject.Singleton

@Module
class DataSourceApiModule {

    @Singleton
    @Provides
    internal fun provideRetrofit() =

            Retrofit.Builder()
                    .baseUrl("https://my-json-server.typicode.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

    @Singleton
    @Provides
    internal fun provideMovementsApiClient(retrofit: Retrofit) =
            MovementApiClient(retrofit.create(MovementApiService::class.java))

    @Singleton
    @Provides
    internal fun provideObligationsApiClient(retrofit: Retrofit) =
            ObligationApiClient(retrofit.create(ObligationApiService::class.java))



}