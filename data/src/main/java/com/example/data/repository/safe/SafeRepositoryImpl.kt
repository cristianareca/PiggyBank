package com.example.data.repository.safe

import com.example.data.source.api.safe.client.SafeApiClient
import com.example.data.source.api.safe.entity.mapToDomain
import com.example.domain.safe.model.Safe
import com.example.domain.safe.repository.SafeRepository
import io.reactivex.rxjava3.core.Single

class SafeRepositoryImpl(private val safeApiClient: SafeApiClient) : SafeRepository {

    override fun getSafes(): Single<List<Safe>> =
            safeApiClient.getSafes()
                    .map {
                        it.mapToDomain()
                    }

}