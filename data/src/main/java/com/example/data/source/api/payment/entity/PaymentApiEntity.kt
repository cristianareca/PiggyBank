package com.example.data.source.api.payment.entity


import com.example.domain.payment.model.Payment

data class PaymentApiEntity (

        val paymentAmount:String,
        val paymentConcept:String
)

fun PaymentApiEntity.mapToDomain()=
        Payment(paymentConcept,paymentAmount)

fun List <PaymentApiEntity>.mapToDomain() = map { it.mapToDomain() }