package com.MAD.data.model.response

import kotlinx.serialization.Serializable

@Serializable
data class CartResponse(
    val data: List<CartItem>,
    val msg: String
) {
    fun toCartModel(): com.MAD.domain.model.CartModel {
        return com.MAD.domain.model.CartModel(
            data = data.map { it.toCartItemModel() },
            msg = msg
        )
    }
}