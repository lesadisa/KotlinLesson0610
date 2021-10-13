package com.example.kotlinlesson0610.domain

import com.example.kotlinlesson0610.data.WeatherRepository
import com.example.kotlinlesson0610.domain.model.WetherDomainModel

class WeatherInteractor(private val repository: WeatherRepository) { //конструктор, чтоб обратиться к repoz b методу
    suspend fun getWeather(): WetherDomainModel {
        return repository.getWeather()
    }
}