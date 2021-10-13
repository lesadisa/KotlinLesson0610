package com.example.kotlinlesson0610.weather_screen.di

import com.example.kotlinlesson0610.data.api.WeatherApi
import com.example.kotlinlesson0610.data.api.WeatherRemoteSource
import com.example.kotlinlesson0610.data.api.WeatherRepo
import com.example.kotlinlesson0610.data.api.WeatherRepoImpl
import com.example.kotlinlesson0610.domain.WeatherInteractor
import com.example.kotlinlesson0610.weather_screen.ui.WeatherScreenViewModel
import okhttp3.OkHttpClient
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://api.openweathermap.org/"
val appModule = module {
    single<OkHttpClient> {
        OkHttpClient.Builder()
            .build()
    }
// создает единоразово синголтен
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
    // синголтон с типом WRS на зо создаем WRS
    single<WeatherRemoteSource> {
        WeatherRemoteSource(get<WeatherApi>())
    }

    single<WeatherRepo> {
        WeatherRepoImpl(get<WeatherRemoteSource>())
    }

    single<WeatherInteractor> {
        WeatherInteractor(get<WeatherRepo>())
    }
    viewModel<WeatherScreenViewModel> {
        WeatherScreenViewModel(get<WeatherInteractor>())
    }

}