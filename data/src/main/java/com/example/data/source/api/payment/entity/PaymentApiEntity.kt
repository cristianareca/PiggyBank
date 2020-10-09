package com.example.data.source.api.payment.entity


import com.example.domain.payment.model.Payment

data class PaymentApiEntity (

        val paymentType:String,
        val paymentAmount:String,
        val paymentConcept:String
)

fun PaymentApiEntity.mapToDomain()=
        Payment(paymentType,paymentAmount,paymentConcept)

fun List <PaymentApiEntity>.mapToDomain() = map { it.mapToDomain() }