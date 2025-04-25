package com.MAD.domain.usecase

import com.MAD.domain.repository.CartRepository

class CartSummaryUseCase (private val repository: CartRepository) {
    suspend fun execute(userId: Long) = repository.getCartSummary(userId)
}