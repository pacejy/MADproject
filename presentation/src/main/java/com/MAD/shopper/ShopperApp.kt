package com.MAD.shopper

import android.app.Application
import com.MAD.data.di.dataModule
import com.MAD.domain.di.domainModule
import com.MAD.shopper.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ShopperApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ShopperApp)
            modules(listOf(
                presentationModule,
                dataModule,
                domainModule
            ))
        }
    }
}