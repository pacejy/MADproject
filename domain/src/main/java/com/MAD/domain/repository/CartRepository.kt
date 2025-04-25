package com.MAD.domain.repository

import com.MAD.domain.model.CartItemModel
import com.MAD.domain.model.CartModel
import com.MAD.domain.model.CartSummary
import com.MAD.domain.model.request.AddCartRequestModel
import com.MAD.domain.network.ResultWrapper

interface CartRepository {
    suspend fun addProductToCart(
        request: AddCartRequestModel, userId: Long
    ): ResultWrapper<CartModel>

    suspend fun getCart(userId: Long): ResultWrapper<CartModel>
    suspend fun updateQuantity(cartItemModel: CartItemModel, userId: Long): ResultWrapper<CartModel>
    suspend fun deleteItem(cartItemId: Int, userId: Long): ResultWrapper<CartModel>
    suspend fun getCartSummary(userId: Long): ResultWrapper<CartSummary>
}