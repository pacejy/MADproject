package com.MAD.domain.usecase

import com.MAD.domain.model.request.AddCartRequestModel
import com.MAD.domain.repository.CartRepository

class AddToCartUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(request: AddCartRequestModel, userId: Long) = cartRepository.addProductToCart(request,userId)
}