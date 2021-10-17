package com.example.kotlinlesson0610.feature.weathers.data.api

import com.example.kotlinlesson0610.feature.weathers.domain.model.WeatherDomainModel

class WeatherRepoImpl(private val source: WeatherRemoteSource) : WeatherRepo {
    override suspend fun getWeather(city: String): WeatherDomainModel {
        return source.getWeather(city).toDomain()
    }
}