package com.example.kotlinlesson0610.weather_screen.di

import android.util.Log
import com.example.kotlinlesson0610.weather_screen.data.WeatherApi
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
// const val BASE_URL = "api.openweathermap.org/data/2.5/"
const val BASE_URL = "api.openweathermap.org/data/2.5/weather?q=London&appid={API key}"
val appModule = module {

    single<OkHttpClient> {
        OkHttpClient.Builder()
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single<WeatherApi> {
        get<Retrofit>().create(WeatherApi::class.java)

    }

}