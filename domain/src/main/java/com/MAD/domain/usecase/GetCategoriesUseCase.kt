package com.MAD.domain.usecase

import com.MAD.domain.repository.CategoryRepository

class GetCategoriesUseCase (private val repository: CategoryRepository) {
    suspend fun execute() = repository.getCategories()
}