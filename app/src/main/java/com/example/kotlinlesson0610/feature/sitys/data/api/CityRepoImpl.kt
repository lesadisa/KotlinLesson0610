package com.example.kotlinlesson0610.feature.sitys.data.api

import com.example.kotlinlesson0610.feature.sitys.domain.model.CityDomainModel

class CityRepoImpl(val source: CityRemoteSource) : CityRepo {
    override suspend fun getCities(prefixName: String): CityDomainModel {
        return source.getCities(prefixName, "5", "0").toDomain()
    }
}