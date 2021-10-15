package com.example.kotlinlesson0610.data.api.model

import com.google.gson.annotations.SerializedName

class WeatherWindModel(
    @SerializedName("speed")
    val speed: Double, //скорость
    @SerializedName("deg")
    val deg: Int, //направление


)