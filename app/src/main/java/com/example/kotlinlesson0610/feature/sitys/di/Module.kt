package com.example.kotlinlesson0610.feature.sitys.di

import com.example.kotlinlesson0610.feature.sitys.data.api.CityApi
import com.example.kotlinlesson0610.feature.sitys.data.api.CityRepo
import com.example.kotlinlesson0610.feature.sitys.data.api.CityRepoImpl
import com.example.kotlinlesson0610.feature.sitys.domain.CityInteractor
import com.example.kotlinlesson0610.feature.sitys.ui.CityScreenViewModel
import okhttp3.OkHttpClient
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


const val BASE_URL = "http://geodb-free-service.wirefreethought.com/"
val appModule = module {

    single<OkHttpClient>(named("http2")) {
        OkHttpClient.Builder()
            .build()
    }

    single<Retrofit>(named("retrofit2")) {
        Retrofit.Builder()
            .baseUrl(com.example.kotlinlesson0610.feature.sitys.di.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get(named("http2")))
            .build()
    }

    single<CityApi> {
        get<Retrofit>(named("retrofit2")).create(CityApi::class.java)
    }

    single<CityRemoteSource> {
        CityRemoteSource(get<CityApi>())
    }


    single<CityRepo> {
        CityRepoImpl(get<CityRemoteSource>())
    }

    single<CityInteractor> {
        CityInteractor(get<CityRepo>())
    }

    viewModel() {
        CityScreenViewModel(get<CityInteractor>())
    }
}