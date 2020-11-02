package com.example.data.repository.sending

import com.example.data.source.api.movement.client.MovementApiClient
import com.example.data.source.api.movement.entity.mapToDomain
import com.example.data.source.api.sending.client.SendingApiClient
import com.example.data.source.api.sending.entity.mapToDomain
import com.example.domain.movement.model.Movement
import com.example.domain.movement.repository.MovementRepository
import com.example.domain.send.model.Sending
import com.example.domain.send.repository.SendingRepository
import io.reactivex.rxjava3.core.Single

class SendingRepositoryImpl(private val sendingApiClient: SendingApiClient) : SendingRepository {

    override fun getSendings(): Single<List<Sending>> =
            sendingApiClient.getSendings()
                    .map {
                        it.mapToDomain()
                    }
}


