package com.example.domain.movement.repository

import com.example.domain.movement.model.Movement
import io.reactivex.rxjava3.core.Single

interface MovementRepository {
    fun getMovements(): Single<List<Movement>>
}