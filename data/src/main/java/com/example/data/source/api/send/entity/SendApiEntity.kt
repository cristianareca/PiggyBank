package com.example.data.source.api.send.entity

import com.example.domain.send.model.Send

data class SendApiEntity (

        val sendPiggyBanger:String,
        val sendAmount:String,
        val sendDate:String
)

fun SendApiEntity.mapToDomain()=
        Send(sendPiggyBanger,sendAmount,sendDate)

fun List <SendApiEntity>.mapToDomain() = map { it.mapToDomain() }