package com.MAD.data.repository

import com.MAD.data.model.CategoryDataModel
import com.MAD.domain.model.CategoriesListModel
import com.MAD.domain.network.NetworkService
import com.MAD.domain.network.ResultWrapper
import com.MAD.domain.repository.CategoryRepository

class CategoryRepositoryImpl(val networkService: NetworkService) : CategoryRepository {
    override suspend fun getCategories(): ResultWrapper<CategoriesListModel> {
        return networkService.getCategories()
    }
}