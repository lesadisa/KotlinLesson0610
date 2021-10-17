package com.example.kotlinlesson0610.feature.sitys.data.api

import com.example.kotlinlesson0610.feature.sitys.domain.model.CityDomainModel

interface CityRepo {
    suspend fun getCities(prefixName: String): CityDomainModel
}