package com.MAD.domain.usecase

import com.MAD.domain.repository.CartRepository

class GetCartUseCase(val cartRepository: CartRepository) {
    suspend fun execute(userId: Long) = cartRepository.getCart(userId)
}