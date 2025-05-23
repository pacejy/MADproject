package com.MAD.shopper.di

import com.MAD.shopper.ui.feature.account.login.LoginViewModel
import com.MAD.shopper.ui.feature.account.register.RegisterViewModel
import com.MAD.shopper.ui.feature.all_products.AllProductsViewModel
import com.MAD.shopper.ui.feature.cart.CartViewModel
import com.MAD.shopper.ui.feature.home.HomeViewModel
import com.MAD.shopper.ui.feature.orders.OrdersViewModel
import com.MAD.shopper.ui.feature.product_details.ProductDetailsViewModel
import com.MAD.shopper.ui.feature.summary.CartSummaryViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        HomeViewModel(get(), get())
    }
    viewModel {
        ProductDetailsViewModel(get(),get())
    }
    viewModel {
        CartViewModel(get(), get(), get(),get())
    }
    viewModel {
        CartSummaryViewModel(get(), get(),get())
    }
    viewModel {
        OrdersViewModel(get(),get())
    }

    viewModel {
        LoginViewModel(get(),get())
    }

    viewModel {
        RegisterViewModel(get(),get())
    }
    viewModel {
        AllProductsViewModel(get(), get(), get())
    }
}