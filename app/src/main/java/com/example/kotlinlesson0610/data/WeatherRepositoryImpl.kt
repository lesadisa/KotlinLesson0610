package com.example.kotlinlesson0610.data

class WeatherRepositoryImpl(private val sourse: WeatherRemoteSourse) : WeatherRepository {
    override suspend fun getWeather(): String {
        //return sourse.getWeather().main.toString()//&&&&&&&&&&&&&&&&&

        return sourse.getWeather().weatherMainModel.temp

        ////непонял

    }
}