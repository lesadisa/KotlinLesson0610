package com.example.kotlinlesson0610.feature.weathers.data.api.model

import com.google.gson.annotations.SerializedName

data class WeatherMainModel(
    @SerializedName("temp")
    val temp: Double,
    @SerializedName("feels_like")
    val feelsLike: Double, //Этот температурный параметр объясняет человеческое восприятие погоды
    @SerializedName("temp_min")
    val tempMin: Double,
    @SerializedName("temp_max")
    val tempMax: Double,
    @SerializedName("pressure")
    val pressure: String, //Атмосферное давление
    @SerializedName("humidity")
    val humidity: Int, //Влажность dв процентах


) {

    /*   "main": {
           "temp": 282.55,
           "feels_like": 281.86,
           "temp_min": 280.37,
           "temp_max": 284.26,
           "pressure": 1023,
           "humidity": 100
       },*/
}