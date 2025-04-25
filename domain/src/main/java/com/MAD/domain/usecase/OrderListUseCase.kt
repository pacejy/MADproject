package com.MAD.domain.usecase

import com.MAD.domain.model.OrdersListModel
import com.MAD.domain.repository.OrderRepository

class OrderListUseCase(
    private val repository: OrderRepository
) {
    suspend fun execute(userId: Long) = repository.getOrderList(userId)
}