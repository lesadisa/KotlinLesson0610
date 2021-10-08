package com.example.kotlinlesson0610.weather_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class WeaherMainModel(
    @SerializedName("temp") val temp: String,
    @SerializedName("feels_like") val feelsLike: String, //Этот температурный параметр объясняет человеческое восприятие погоды
    @SerializedName("temp_min") val tempMin: String,
    @SerializedName("temp_max") val tempMax: String,
    @SerializedName("pressure") val pressure: String, //Атмосферное давление
    @SerializedName("humidity") val humidity: String //Влажность dв процентах
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