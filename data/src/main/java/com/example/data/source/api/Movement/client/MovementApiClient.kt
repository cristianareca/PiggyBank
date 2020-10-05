package com.example.data.source.api.Movement.client

import com.example.data.source.api.Movement.entity.MovementApiEntity
import com.example.domain.movement.model.Movement
import io.reactivex.rxjava3.core.Single

class MovementApiClient {

    fun getMovements(): Single<List<MovementApiEntity>> =
            Single.create<List<MovementApiEntity>> {
                it.onSuccess(
                        listOf(
                                MovementApiEntity("Ingreso", "15000", "Salario"),
                                MovementApiEntity("Egreso", "15000", "Salario"),
                                MovementApiEntity("Ingreso", "15000", "Salario"),
                                MovementApiEntity("Egreso", "15000", "Salario"),
                                MovementApiEntity("Ingreso", "15000", "Salario"),
                                MovementApiEntity("Egreso", "15000", "Salario")
                        )
                )
            }
}