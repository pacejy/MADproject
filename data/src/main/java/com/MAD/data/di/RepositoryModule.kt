package com.MAD.data.di

import com.MAD.data.repository.CategoryRepositoryImpl
import com.MAD.data.repository.ProductRepositoryImpl
import com.MAD.domain.repository.CartRepository
import com.MAD.domain.repository.CategoryRepository
import com.MAD.domain.repository.OrderRepository
import com.MAD.domain.repository.ProductRepository
import com.MAD.domain.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<ProductRepository> { ProductRepositoryImpl(get()) }
    single<CategoryRepository> { CategoryRepositoryImpl(get()) }
    single<CartRepository> { com.MAD.data.repository.CartRepositoryImpl(get()) }
    single<OrderRepository> { com.MAD.data.repository.OrderRepositoryImpl(get()) }
    single<UserRepository> { com.MAD.data.repository.UserRepositoryImpl(get()) }
}