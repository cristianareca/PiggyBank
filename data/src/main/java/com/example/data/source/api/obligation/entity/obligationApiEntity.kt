package com.example.data.source.api.obligation.entity

import com.example.domain.obligation.model.Obligation

data class ObligationApiEntity (

        val obligationDate:String,
        val obligationAmount:String,
        val obligationConcept:String
)

fun ObligationApiEntity.mapToDomain()=
            Obligation(obligationDate,obligationAmount,obligationConcept)

fun List <ObligationApiEntity>.mapToDomain() = map { it.mapToDomain() }