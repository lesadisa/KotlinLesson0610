package com.example.kotlinlesson0610.feature.sitys.data.api

import com.example.kotlinlesson0610.feature.sitys.data.api.model.CityModel

class CityRemoteSource(private val api: CityApi) {
    suspend fun getCities(prefixName: String, limit: String, offset: String): CityModel {
        return api.getCities(prefixName, false, limit, offset)
    }
}