package com.MAD.domain.repository

import com.MAD.domain.model.Product
import com.MAD.domain.model.ProductListModel
import com.MAD.domain.network.ResultWrapper

interface ProductRepository {
    suspend fun getProducts(category:Int?): ResultWrapper<ProductListModel>
}