package com.MAD.data.model

import kotlinx.serialization.Serializable

@Serializable
class DataProductModel(
    val categoryId: Int,
    val description: String,
    val id: Int,
    val image: String,
    val price: Double,
    val title: String
) {

    fun toProduct() = com.MAD.domain.model.Product(
        id = id,
        title = title,
        price = price,
        categoryId = categoryId,
        description = description,
        image = image
    )
}
