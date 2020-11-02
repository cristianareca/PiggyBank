package com.example.data.source.api.sending.entity

import com.example.domain.send.model.Sending


data class SendingApiEntity (

        val piggybanker:String,
        val sendAmount:String,
        val sendDate:String
)

fun SendingApiEntity.mapToDomain()=
        Sending(piggybanker,sendAmount, sendDate)


fun List <SendingApiEntity>.mapToDomain() = map { it.mapToDomain() }