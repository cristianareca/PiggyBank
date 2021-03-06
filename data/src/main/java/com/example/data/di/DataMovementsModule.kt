package com.example.data.di


import com.example.data.repository.movement.MovementRepositoryImpl
import com.example.data.source.api.movement.client.MovementApiClient
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [DataSourceApiModule::class])

class DataMovementsModule {

    @Singleton
    @Provides
    internal fun provideMusicRepository(
            movementApiClient: MovementApiClient
    ) = MovementRepositoryImpl(movementApiClient)

}
