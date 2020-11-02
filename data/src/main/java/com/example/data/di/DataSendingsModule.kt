package com.example.data.di


import com.example.data.repository.movement.MovementRepositoryImpl
import com.example.data.repository.sending.SendingRepositoryImpl
import com.example.data.source.api.movement.client.MovementApiClient
import com.example.data.source.api.sending.client.SendingApiClient
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [DataSourceApiModule::class])

class DataSendingsModule {

    @Singleton
    @Provides
    internal fun provideSendingRepository(
            sendingApiClient: SendingApiClient
    ) = SendingRepositoryImpl(sendingApiClient)

}
