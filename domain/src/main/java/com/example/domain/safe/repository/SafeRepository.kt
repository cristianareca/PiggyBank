package com.example.domain.safe.repository

import com.example.domain.safe.model.Safe
import io.reactivex.rxjava3.core.Single

interface SafeRepository {
    fun getSafes(): Single<List<Safe>>
}