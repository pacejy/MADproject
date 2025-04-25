package com.MAD.data.model.response

import kotlinx.serialization.Serializable

@Serializable
data class OrdersListResponse(
    val `data`: List<OrderListData>,
    val msg: String
) {
    fun toDomainResponse(): com.MAD.domain.model.OrdersListModel {
        return com.MAD.domain.model.OrdersListModel(
            `data` = `data`.map { it.toDomainResponse() },
            msg = msg
        )
    }
}