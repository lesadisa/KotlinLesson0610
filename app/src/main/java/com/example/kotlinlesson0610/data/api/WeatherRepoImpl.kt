package com.example.kotlinlesson0610.data.api

import com.example.kotlinlesson0610.domain.model.WeatherDomainModel

class WeatherRepoImpl(private val source: WeatherRemoteSource) : WeatherRepo {
    override suspend fun getWeather(): WeatherDomainModel {
        return source.getWeather("").toDomain()
    }
}