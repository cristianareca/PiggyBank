package com.example.domain.send.usecase

import com.example.domain.send.repository.SendRepository
import io.reactivex.rxjava3.schedulers.Schedulers

class GetSendsUseCase(private val movementRepository: SendRepository) {
    fun execute() = movementRepository.getSends()
            .subscribeOn(Schedulers.io())
}