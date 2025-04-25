package com.MAD.domain.di

import com.MAD.domain.usecase.AddToCartUseCase
import com.MAD.domain.usecase.CartSummaryUseCase
import com.MAD.domain.usecase.DeleteProductUseCase
import com.MAD.domain.usecase.GetCartUseCase
import com.MAD.domain.usecase.GetCategoriesUseCase
import com.MAD.domain.usecase.GetProductUseCase
import com.MAD.domain.usecase.LoginUseCase
import com.MAD.domain.usecase.OrderListUseCase
import com.MAD.domain.usecase.PlaceOrderUseCase
import com.MAD.domain.usecase.RegisterUseCase
import com.MAD.domain.usecase.UpdateQuantityUseCase
import org.koin.dsl.module


val useCaseModule = module {
    factory { GetProductUseCase(get()) }
    factory { GetCategoriesUseCase(get()) }
    factory { AddToCartUseCase(get()) }
    factory { GetCartUseCase(get()) }
    factory { UpdateQuantityUseCase(get()) }
    factory { DeleteProductUseCase(get()) }
    factory { CartSummaryUseCase(get()) }
    factory { PlaceOrderUseCase(get()) }
    factory { OrderListUseCase(get()) }
    factory { LoginUseCase(get()) }
    factory { RegisterUseCase(get()) }
}