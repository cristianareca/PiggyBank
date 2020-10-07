package com.example.data.repository.movement

import com.example.data.source.api.movement.client.MovementApiClient
import com.example.data.source.api.movement.entity.mapToDomain
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