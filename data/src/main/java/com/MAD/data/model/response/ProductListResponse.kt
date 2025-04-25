package com.MAD.data.model.response

import com.MAD.data.model.DataProductModel
import kotlinx.serialization.Serializable

@Serializable
data class ProductListResponse(
    val `data`: List<DataProductModel>,
    val msg: String
) {
    fun toProductList() = com.MAD.domain.model.ProductListModel(
        products = `data`.map { it.toProduct() },
        msg = msg
    )
}