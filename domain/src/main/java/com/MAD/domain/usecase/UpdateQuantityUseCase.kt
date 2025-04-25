package com.MAD.domain.usecase

import com.MAD.domain.model.CartItemModel
import com.MAD.domain.repository.CartRepository

class UpdateQuantityUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(cartItemModel: CartItemModel, userId: Long) =
        cartRepository.updateQuantity(cartItemModel, userId)
}