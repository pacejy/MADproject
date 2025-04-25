package com.MAD.shopper.di

import com.MAD.shopper.ShopperSession
import org.koin.dsl.module

val presentationModule = module {
    includes(viewModelModule)
    single { ShopperSession(get()) }
}