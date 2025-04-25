package com.MAD.data.model.response

import kotlinx.serialization.Serializable

@Serializable
data class CartSummaryResponse(
    val `data`: Summary,
    val msg: String
) {
    fun toCartSummary() = com.MAD.domain.model.CartSummary(
        data = `data`.toSummaryData(),
        msg = msg
    )
}