package com.example.kotlinlesson0610.feature.weathers.data.api.model

import com.google.gson.annotations.SerializedName

class WeatherWindModel(
    @SerializedName("speed")
    val speed: Double, //скорость
    @SerializedName("deg")
    val degree: Int, //направление


)