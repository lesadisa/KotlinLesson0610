package com.example.kotlinlesson0610.domain

import com.example.kotlinlesson0610.data.api.WeatherRepo
import com.example.kotlinlesson0610.domain.model.WeatherDomainModel


// можем объединить тут несколько репозиториев
class WeatherInteractor(private val repository: WeatherRepo) {
    suspend fun getWeather(): WeatherDomainModel {
        return repository.getWeather()
    }
}