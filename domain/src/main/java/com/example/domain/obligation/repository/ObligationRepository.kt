package com.example.domain.obligation.repository

import com.example.domain.obligation.model.Obligation
import io.reactivex.rxjava3.core.Single

interface ObligationRepository {
    fun getObligation(): Single<List<Obligation>>
}