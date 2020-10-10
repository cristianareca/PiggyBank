package com.example.data.di


import com.example.data.repository.send.SendRepositoryImpl
import com.example.data.source.api.send.client.SendApiClient
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [DataSourceApiModule::class])

class DataSendsModule {

    @Singleton
    @Provides
    internal fun provideMusicRepository(
            sendApiClient: SendApiClient
    ) = SendRepositoryImpl(sendApiClient)

}
