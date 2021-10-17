package com.example.kotlinlesson0610.feature.weathers.domain.model

data class WeatherDomainModel(
    val temperature: Double,
    val feelsLike: Double,
    val tempMin: Double,
    val tempMax: Double,
    val pressure: String,
    val humidity: Int,
    val windDomainModel: WindDomainModel

)

