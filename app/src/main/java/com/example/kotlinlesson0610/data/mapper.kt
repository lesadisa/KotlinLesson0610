package com.example.kotlinlesson0610.data.api

import com.example.kotlinlesson0610.data.api.model.WeatherModel
import com.example.kotlinlesson0610.domain.model.WeatherDomainModel


fun WeatherModel.toDomain(): WeatherDomainModel {
    return WeatherDomainModel(
        this.main.temp,
        this.main.feelsLike,
        this.main.tempMin,
        this.main.tempMax,
        this.main.pressure,
        this.main.humidity

    )
}

/*
@SerializedName("temp")
    val temp: String,
    @SerializedName("feels_like")
    val feelsLike: String, //Этот температурный параметр объясняет человеческое восприятие погоды
    @SerializedName("temp_min")
    val tempMin: String,
    @SerializedName("temp_max")
    val tempMax: String,
    @SerializedName("pressure")
    val pressure: String, //Атмосферное давление
    @SerializedName("humidity")
    val humidity: String //Влажность dв процентах


 */