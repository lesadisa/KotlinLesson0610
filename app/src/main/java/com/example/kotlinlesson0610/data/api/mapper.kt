package com.example.kotlinlesson0610.data.api

import com.example.kotlinlesson0610.data.api.model.WeatherModel
import com.example.kotlinlesson0610.domain.model.WetherDomainModel

fun WeatherModel.toDomain(): WetherDomainModel {
    return WetherDomainModel(
        this.weatherMainModel.temp
    )

}