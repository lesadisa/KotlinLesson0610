package com.example.kotlinlesson0610.data

class WeatherRepositoryImpl(private val sourse: WeatherRemoteSourse) : WeatherRepository {
    override suspend fun getWeather(): WeatherDomainModel {


        return sourse.getWeather().weatherMainModel.temp

        ////непонял

    }
}