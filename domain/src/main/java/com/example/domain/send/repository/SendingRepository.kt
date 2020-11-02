package com.example.domain.send.repository

import com.example.domain.send.model.Sending
import io.reactivex.rxjava3.core.Single

interface SendingRepository {
    fun getSendings(): Single<List<Sending>>
}