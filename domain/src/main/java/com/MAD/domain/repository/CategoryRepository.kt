package com.MAD.domain.repository

import com.MAD.domain.model.CategoriesListModel
import com.MAD.domain.network.ResultWrapper

interface CategoryRepository {
    suspend fun getCategories(): ResultWrapper<CategoriesListModel>
}