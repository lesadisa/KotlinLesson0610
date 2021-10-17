package com.example.kotlinlesson0610.feature.sitys.data.api.model

import com.google.gson.annotations.SerializedName

class CityMainModel(
    @SerializedName("type")
    val type: String,
    @SerializedName("city")
    val city: String
)