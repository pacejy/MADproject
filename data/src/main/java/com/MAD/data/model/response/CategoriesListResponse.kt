package com.MAD.data.model.response

import com.MAD.data.model.CategoryDataModel
import kotlinx.serialization.Serializable

@Serializable
data class CategoriesListResponse(
    val `data`: List<CategoryDataModel>,
    val msg: String
) {
    fun toCategoriesList() = com.MAD.domain.model.CategoriesListModel(
        categories = `data`.map { it.toCategory() },
        msg = msg
    )
}