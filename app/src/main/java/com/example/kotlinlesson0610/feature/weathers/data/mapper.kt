package com.example.kotlinlesson0610.feature.weathers.data.api

import com.example.kotlinlesson0610.feature.weathers.data.api.model.WeatherModel
import com.example.kotlinlesson0610.feature.weathers.data.api.model.WeatherWindModel
import com.example.kotlinlesson0610.feature.weathers.domain.model.WeatherDomainModel
import com.example.kotlinlesson0610.feature.weathers.domain.model.WindDomainModel


fun WeatherModel.toDomain() = WeatherDomainModel(
    temperature = main.temp,
    feelsLike = main.feelsLike,
    tempMin = main.tempMin,
    tempMax = main.tempMax,
    pressure = main.pressure,
    humidity = main.humidity,
    windDomainModel = wind.toDomain()
)

fun WeatherWindModel.toDomain() = WindDomainModel(
    speed = speed,
    degree = degree
)