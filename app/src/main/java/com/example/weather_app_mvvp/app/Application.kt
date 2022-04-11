package com.example.weather_app_mvvp.app

import android.app.Application
import com.example.weather_app_mvvp.app.di.netWorkModule
import org.koin.core.context.startKoin

class Application() : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                netWorkModule,
                )
        }
    }
}