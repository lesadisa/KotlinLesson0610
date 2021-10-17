package com.example.kotlinlesson0610.feature.weathers.domain

import com.example.kotlinlesson0610.feature.weathers.data.api.WeatherRepo
import com.example.kotlinlesson0610.feature.weathers.domain.model.WeatherDomainModel

// можем объединить тут несколько репозиториев
class WeatherInteractor(private val repository: WeatherRepo) {
    suspend fun getWeather(city: String): WeatherDomainModel {
        return repository.getWeather(city)
    }
}