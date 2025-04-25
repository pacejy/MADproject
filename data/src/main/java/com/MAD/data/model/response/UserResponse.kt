package com.MAD.data.model.response

import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val id: Int?,
    val username: String,
    val email: String,
    val name: String
) {
    fun toDomainModel() = com.MAD.domain.model.UserDomainModel(
        id = id,
        username = username,
        email = email,
        name = name
    )
}
