package com.example.kotlinlesson0610.feature.weathers.data.api.model

import com.google.gson.annotations.SerializedName

// иницилизуем сначала указывая что переменная
data class WeatherModel(
    @SerializedName("main")
    val main: WeatherMainModel,
    @SerializedName("wind")
    val wind: WeatherWindModel
)


