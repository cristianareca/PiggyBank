package com.example.data.repository

import com.example.data.source.api.Movement.client.MovementApiClient
import com.example.data.source.api.Movement.entity.mapToDomain
import com.example.domain.movement.model.Movement
import com.example.domain.movement.repository.MovementRepository
import io.reactivex.rxjava3.core.Single

class MovementRepositoryImpl(private val movementApiClient: MovementApiClient) : MovementRepository {

    override fun getMovements(): Single<List<Movement>> =
            movementApiClient.getMovements()
                    .map {
                        it.mapToDomain()
                    }

}