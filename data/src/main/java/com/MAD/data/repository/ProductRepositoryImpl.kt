package com.MAD.data.repository

import com.MAD.domain.model.Product
import com.MAD.domain.model.ProductListModel
import com.MAD.domain.network.NetworkService
import com.MAD.domain.network.ResultWrapper
import com.MAD.domain.repository.ProductRepository

class ProductRepositoryImpl(private val networkService: NetworkService) : ProductRepository {
    override suspend fun getProducts(category: Int?): ResultWrapper<ProductListModel> {
        return networkService.getProducts(category)
    }
}