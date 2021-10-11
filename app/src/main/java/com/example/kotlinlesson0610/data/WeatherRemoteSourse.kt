package com.example.kotlinlesson0610.data

import com.example.kotlinlesson0610.data.api.model.WeatherModel

class WeatherRemoteSourse(private val api: WeatherApi) {
    suspend fun getWeather(): WeatherModel {
        return api.getWeather("Moscow")
    }

}