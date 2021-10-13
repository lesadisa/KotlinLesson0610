package com.example.kotlinlesson0610.data

import com.example.kotlinlesson0610.data.api.model.WeatherModel
import retrofit2.http.GET
import retrofit2.http.Query



interface WeatherApi {

    @GET("data/2.5/weather")
    suspend fun getWeather(
        @Query("q") cityName: String,
        @Query("appid") appId: String = "33ae2570581f89ec8a89d91abbcbc508",
        @Query("units") units: String = "metric"
    ): WeatherModel


}
