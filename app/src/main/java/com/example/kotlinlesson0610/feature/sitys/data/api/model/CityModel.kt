package com.example.kotlinlesson0610.feature.sitys.data.api.model

import com.google.gson.annotations.SerializedName

data class CityModel(@SerializedName("data") val data: List<CityMainModel>) {
}