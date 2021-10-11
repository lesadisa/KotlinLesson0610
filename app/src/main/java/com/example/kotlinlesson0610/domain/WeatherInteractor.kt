package com.example.kotlinlesson0610.domain

import com.example.kotlinlesson0610.data.WeatherRepository

class WeatherInteractor(private val repository: WeatherRepository) { //конструктор, чтоб обратиться к repoz b методу
    suspend fun getWeather(): String {
        return repository.getWeather()

    }


}