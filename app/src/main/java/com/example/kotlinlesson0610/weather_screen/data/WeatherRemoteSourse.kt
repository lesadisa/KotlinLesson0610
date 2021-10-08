package com.example.kotlinlesson0610.weather_screen.data

import com.example.kotlinlesson0610.weather_screen.data.api.model.WeatherModel

class WeatherRemoteSourse(val api: WeatherApi) {
    fun getWeather(): WeatherModel {
        return api.getWeather("Moscow")
    }

}