package com.example.kotlinlesson0610.feature.sitys.domain

import com.example.kotlinlesson0610.feature.sitys.data.api.CityRepo
import com.example.kotlinlesson0610.feature.sitys.domain.model.CityDomainModel

class CityInteractor(private val repository: CityRepo) {
    suspend fun getCities(prefixName: String): CityDomainModel {
        return repository.getCities(prefixName)
    }
}