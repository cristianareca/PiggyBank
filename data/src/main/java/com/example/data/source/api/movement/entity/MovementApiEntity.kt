package com.example.data.source.api.movement.entity

import com.example.domain.movement.model.Movement

data class MovementApiEntity (

        val movementType:String,
        val movementAmount:String,
        val movementConcept:String
)

fun MovementApiEntity.mapToDomain()=
        Movement(movementType,movementAmount,movementConcept)

fun List <MovementApiEntity>.mapToDomain() = map { it.mapToDomain() }