package com.app.ecostep.domain.model

data class User(
    val firebaseId: String,
    val name: String,
    val lastname: String,
    val email: String
)