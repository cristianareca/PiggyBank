package com.example.data.source.api.safe.entity

import com.example.domain.safe.model.Safe

data class SafeApiEntity (

        val safeAmount:String,
        val safeConcept:String,
        val safeDate: String
)

fun SafeApiEntity.mapToDomain()=
        Safe(safeAmount,safeConcept,safeDate)

fun List <SafeApiEntity>.mapToDomain() = map { it.mapToDomain() }