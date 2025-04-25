package com.MAD.domain.usecase

import com.MAD.domain.model.CartItemModel
import com.MAD.domain.repository.CartRepository

class DeleteProductUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(cartItemId: Int, userId: Long) = cartRepository.deleteItem(cartItemId, userId)
}