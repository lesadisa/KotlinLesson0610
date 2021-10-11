package com.example.kotlinlesson0610.weather_screen.di

import com.example.kotlinlesson0610.data.WeatherApi
import com.example.kotlinlesson0610.data.WeatherRemoteSourse
import com.example.kotlinlesson0610.data.WeatherRepository
import com.example.kotlinlesson0610.data.WeatherRepositoryImpl
import com.example.kotlinlesson0610.domain.WeatherInteractor
import com.example.kotlinlesson0610.weather_screen.ui.WeatherScreenViewModel
import okhttp3.OkHttpClient
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "api.openweathermap.org/data/2.5/"
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
    single<WeatherRemoteSourse> {
        WeatherRemoteSourse(get<WeatherApi>())
    }

    single<WeatherRepository> {
        WeatherRepositoryImpl(get<WeatherRemoteSourse>())
    }

    single<WeatherInteractor> {
        WeatherInteractor(get<WeatherRepository>())
    }
    viewModel<WeatherScreenViewModel> {
        WeatherScreenViewModel(get<WeatherInteractor>())
    }

}