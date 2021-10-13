package com.example.kotlinlesson0610.data.api.model

import com.google.gson.annotations.SerializedName

// иницилизуем сначала указывая что переменная
data class WeatherModel(@SerializedName("name") val weatherMainModel: WeatherMainModel)


