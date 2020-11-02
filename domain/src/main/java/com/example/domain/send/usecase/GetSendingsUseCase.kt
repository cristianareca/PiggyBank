package com.example.domain.send.usecase

import com.example.domain.movement.repository.MovementRepository
import com.example.domain.send.repository.SendingRepository
import io.reactivex.rxjava3.schedulers.Schedulers

class GetSendingsUseCase(private val sendingRepository: SendingRepository) {
    fun execute() = sendingRepository.getSendings()
            .subscribeOn(Schedulers.io())
}