package com.example.kotlinlesson0610.data

interface WeatherRepository {
    suspend fun getWeather(): String


}