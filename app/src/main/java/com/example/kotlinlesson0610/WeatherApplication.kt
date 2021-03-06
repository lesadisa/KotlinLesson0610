package com.example.kotlinlesson0610

import android.app.Application
import com.example.kotlinlesson0610.weather_screen.di.appModule

import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class WeatherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@WeatherApplication)
            modules(appModule)
        }
    }

}
