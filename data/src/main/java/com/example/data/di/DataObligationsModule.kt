package com.example.data.di


import com.example.data.repository.obligation.ObligationRepositoryImpl
import com.example.data.source.api.obligation.client.ObligationApiClient
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [DataSourceApiModule::class])

class DataObligationsModule {

    @Singleton
    @Provides
    internal fun provideMusicRepository(
            obligationApiClient: ObligationApiClient
    ) = ObligationRepositoryImpl(obligationApiClient)

}
