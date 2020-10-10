package com.example.domain.send.usecase

import com.example.domain.send.repository.SendRepository
import io.reactivex.rxjava3.schedulers.Schedulers

class GetSendsUseCase(private val sendRepository: SendRepository) {
    fun execute() = sendRepository.getSends()
            .subscribeOn(Schedulers.io())
}