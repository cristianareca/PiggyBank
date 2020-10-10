package com.example.domain.send.repository

import com.example.domain.send.model.Send
import io.reactivex.rxjava3.core.Single

interface SendRepository {
    fun getSends(): Single<List<Send>>
}