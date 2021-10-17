package com.example.kotlinlesson0610.feature.weathers.data.api

import com.example.kotlinlesson0610.feature.weathers.data.api.model.WeatherModel

class WeatherRemoteSource(val api: WeatherApi) {
    suspend fun getWeather(cityName: String): WeatherModel {
        return api.getWeather(cityName)
    }
}