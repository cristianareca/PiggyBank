package com.example.data.source.api.payment.entity


import com.example.domain.payment.model.Payment

data class PaymentApiEntity (
        val paymentConcept:String,
        val paymentAmount:String,
        val paymentDate:String
)

fun PaymentApiEntity.mapToDomain()=
        Payment(paymentConcept,paymentAmount,paymentDate)

fun List <PaymentApiEntity>.mapToDomain() = map { it.mapToDomain() }