package com.example.domain.movement.usecase

import com.example.domain.movement.repository.MovementRepository
import io.reactivex.rxjava3.schedulers.Schedulers

class GetMovementsUseCase(private val movementRepository: MovementRepository) {
    fun execute() = movementRepository.getMovements()
            .subscribeOn(Schedulers.io())
}