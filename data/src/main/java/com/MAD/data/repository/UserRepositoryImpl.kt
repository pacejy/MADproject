package com.MAD.data.repository

import com.MAD.domain.network.NetworkService
import com.MAD.domain.repository.UserRepository

class UserRepositoryImpl(private val networkService: NetworkService) : UserRepository {
    override suspend fun register(email: String, password: String, name: String) =
        networkService.register(email, password, name)

    override suspend fun login(email: String, password: String) =
        networkService.login(email, password)
}