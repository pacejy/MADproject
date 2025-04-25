package com.MAD.domain.repository

import com.MAD.domain.model.AddressDomainModel
import com.MAD.domain.model.OrdersListModel
import com.MAD.domain.network.ResultWrapper

interface OrderRepository {
    suspend fun placeOrder(addressDomainModel: AddressDomainModel, userId: Long): ResultWrapper<Long>
    suspend fun getOrderList(userId: Long): ResultWrapper<OrdersListModel>
}