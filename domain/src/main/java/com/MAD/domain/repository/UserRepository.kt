package com.MAD.domain.repository

import com.MAD.domain.model.UserDomainModel
import com.MAD.domain.network.ResultWrapper

interface UserRepository {
    suspend fun login(email: String, password: String): ResultWrapper<UserDomainModel>
    suspend fun register(
        email: String,
        password: String,
        name: String
    ): ResultWrapper<UserDomainModel>
}