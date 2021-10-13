package com.example.kotlinlesson0610.data.api

import com.example.kotlinlesson0610.data.api.model.WeatherModel
import com.example.kotlinlesson0610.domain.model.WeatherDomainModel


fun WeatherModel.toDomain(): WeatherDomainModel {
    return WeatherDomainModel(
        this.main.temp,
        this.main.tempMin

    )
}