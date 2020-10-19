package com.example.domain.obligation.usecase

import com.example.domain.obligation.repository.ObligationRepository
import io.reactivex.rxjava3.schedulers.Schedulers

class GetObligationUseCase(private val obligationRepository: ObligationRepository) {
    fun execute() = obligationRepository.getObligation()
            .subscribeOn(Schedulers.io())
}