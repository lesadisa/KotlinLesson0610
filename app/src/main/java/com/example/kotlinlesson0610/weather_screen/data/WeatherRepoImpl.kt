package com.example.kotlinlesson0610.weather_screen.data

class WeatherRepoImpl(val sourse: WeatherRemoteSourse) : WeatherRepo {
    override fun getWeather(): String {
        return "123456 вернусь потом"
    }
}