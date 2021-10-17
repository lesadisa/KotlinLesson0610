package com.example.kotlinlesson0610.feature.sitys.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinlesson0610.feature.sitys.domain.CityInteractor
import com.example.kotlinlesson0610.feature.sitys.domain.model.CityDomainModel
import kotlinx.coroutines.launch

class CityScreenViewModel(private val cityInteractor: CityInteractor) : ViewModel() {

    val lifeData: MutableLiveData<CityDomainModel> = MutableLiveData()

    fun requestCities(prefixName: String) {
        viewModelScope.launch {
            lifeData.postValue(cityInteractor.getCities(prefixName))
        }
    }
}