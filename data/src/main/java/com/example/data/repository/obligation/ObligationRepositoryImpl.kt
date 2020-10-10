package com.example.data.repository.obligation

import com.example.data.source.api.obligation.client.ObligationApiClient
import com.example.data.source.api.obligation.entity.mapToDomain
import com.example.domain.obligation.model.Obligation
import com.example.domain.obligation.repository.ObligationRepository
import io.reactivex.rxjava3.core.Single

class ObligationRepositoryImpl(private val obligationApiClient: ObligationApiClient) : ObligationRepository {

    override fun getObligation(): Single<List<Obligation>> =
            obligationApiClient.getObligations()
                    .map {
                        it.mapToDomain()
                    }

}