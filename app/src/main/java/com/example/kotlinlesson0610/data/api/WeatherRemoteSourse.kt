package com.example.kotlinlesson0610.data.api

import com.example.kotlinlesson0610.data.api.model.WeatherModel

class WeatherRemoteSource(val api: WeatherApi) {
    suspend fun getWeather(cityName: String): WeatherModel {
        return api.getWeather("Moscow")
    }
}