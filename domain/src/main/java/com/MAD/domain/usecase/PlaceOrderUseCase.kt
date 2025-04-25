package com.MAD.domain.usecase

import com.MAD.domain.model.AddressDomainModel
import com.MAD.domain.repository.OrderRepository

class PlaceOrderUseCase(val orderRepository: OrderRepository) {
    suspend fun execute(addressDomainModel: AddressDomainModel, userId: Long) =
        orderRepository.placeOrder(addressDomainModel,userId)
}