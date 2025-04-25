package com.MAD.data.repository

import com.MAD.domain.model.AddressDomainModel
import com.MAD.domain.model.OrdersListModel
import com.MAD.domain.network.NetworkService
import com.MAD.domain.network.ResultWrapper
import com.MAD.domain.repository.OrderRepository

class OrderRepositoryImpl(private val networkService: NetworkService) : OrderRepository {
    override suspend fun placeOrder(
        addressDomainModel: AddressDomainModel,
        userId: Long
    ): ResultWrapper<Long> {
        return networkService.placeOrder(addressDomainModel, userId)
    }

    override suspend fun getOrderList(userId: Long): ResultWrapper<OrdersListModel> {
        return networkService.getOrderList(userId)
    }
}