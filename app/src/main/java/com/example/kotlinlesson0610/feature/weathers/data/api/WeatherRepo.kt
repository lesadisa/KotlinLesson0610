package com.example.kotlinlesson0610.feature.weathers.data.api

import com.example.kotlinlesson0610.feature.weathers.domain.model.WeatherDomainModel

interface WeatherRepo {
    suspend fun getWeather(city: String): WeatherDomainModel
}