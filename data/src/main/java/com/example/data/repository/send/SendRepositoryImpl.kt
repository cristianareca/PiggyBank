package com.example.data.repository.send

import com.example.data.source.api.send.client.SendApiClient
import com.example.data.source.api.send.entity.mapToDomain
import com.example.domain.send.model.Send
import com.example.domain.send.repository.SendRepository
import io.reactivex.rxjava3.core.Single

class SendRepositoryImpl(private val sendApiClient: SendApiClient) : SendRepository {

    override fun getSends(): Single<List<Send>> =
            sendApiClient.getSends()
                    .map {
                        it.mapToDomain()
                    }

}