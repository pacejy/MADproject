package com.MAD.domain.usecase

import com.MAD.domain.repository.ProductRepository

class GetProductUseCase(private val repository: ProductRepository) {
    suspend fun execute(category:Int?) = repository.getProducts(category)
}