package com.example.kotlinlesson0610.domain.model

data class WeatherDomainModel(
    val temperature: String,
    val feelsLike: String,
    val tempMin: String,
    val tempMax: String,
    val pressure: String,
    val humidity: String
)

