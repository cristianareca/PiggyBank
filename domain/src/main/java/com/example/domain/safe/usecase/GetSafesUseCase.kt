package com.example.domain.safe.usecase

import com.example.domain.safe.repository.SafeRepository
import io.reactivex.rxjava3.schedulers.Schedulers

class GetSafesUseCase(private val safeRepository: SafeRepository) {
    fun execute() = safeRepository.getSafes()
            .subscribeOn(Schedulers.io())
}