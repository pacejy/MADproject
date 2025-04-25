package com.MAD.domain.usecase

import com.MAD.domain.repository.UserRepository

class LoginUseCase(private val userRepository: UserRepository) {
    suspend fun execute(username: String, password: String) =
        userRepository.login(username, password)
}