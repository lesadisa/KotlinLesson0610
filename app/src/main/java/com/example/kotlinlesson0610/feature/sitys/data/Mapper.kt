package com.example.kotlinlesson0610.feature.sitys.data.api

import com.example.kotlinlesson0610.feature.sitys.data.api.model.CityModel
import com.example.kotlinlesson0610.feature.sitys.domain.model.CityDomainModel

fun CityModel.toDomain(): CityDomainModel {
    val filterList = this.data.filter { it.type == "CITY" }
    val mapList = filterList.map { it.city }
    val sortedList = mapList.sortedBy { it }

    return CityDomainModel(
        sortedList
    )
}