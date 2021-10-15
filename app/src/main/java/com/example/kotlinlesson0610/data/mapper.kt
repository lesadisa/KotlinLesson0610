package com.example.kotlinlesson0610.data.api

import com.example.kotlinlesson0610.data.api.model.WeatherModel
import com.example.kotlinlesson0610.domain.model.WeatherDomainModel


fun WeatherModel.toDomain() = WeatherDomainModel(
    temperature = main.temp,
    feelsLike = main.feelsLike,
    tempMin = main.tempMin,
    tempMax = main.tempMax,
    pressure = main.pressure,
    humidity = main.humidity,
    speeds = wind.speed,
    degs = wind.deg,

    )
