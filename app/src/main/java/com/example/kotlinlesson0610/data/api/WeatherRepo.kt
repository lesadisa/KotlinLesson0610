package com.example.kotlinlesson0610.data.api

import com.example.kotlinlesson0610.domain.model.WeatherDomainModel

interface WeatherRepo {
    suspend fun getWeather(): WeatherDomainModel
}