package com.example.data.di


import com.example.data.repository.safe.SafeRepositoryImpl
import com.example.data.source.api.safe.client.SafeApiClient
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [DataSourceApiModule::class])

class DataSafesModule {

    @Singleton
    @Provides
    internal fun provideSafeRepository(
            safeApiClient: SafeApiClient
    ) = SafeRepositoryImpl(safeApiClient)

}
