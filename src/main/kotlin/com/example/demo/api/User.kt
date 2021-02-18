package com.example.demo.api

typealias UserId = String

data class User(
    val id: UserId = "",
    val name: String,
    val description: String = "",
    val secretType: String = "",
    val roles: List<String> = listOf(),
    val meta: Map<String, String>? = mapOf(),
)

data class UserSecret(
    val userId: UserId,
    val secretType: String,
    val value: String,
)
