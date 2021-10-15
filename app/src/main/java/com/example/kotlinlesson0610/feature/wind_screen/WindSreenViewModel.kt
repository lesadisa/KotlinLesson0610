package com.example.kotlinlesson0610.feature.wind_screen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinlesson0610.domain.WeatherInteractor
import com.example.kotlinlesson0610.domain.model.WeatherDomainModel
import kotlinx.coroutines.launch

class WindSreenViewModel(private val winditeractor: WeatherInteractor) : ViewModel() {
    val lifeData: MutableLiveData<WeatherDomainModel> = MutableLiveData()

    fun requesWeather() {
        viewModelScope.launch {
            lifeData.postValue(winditeractor.getWeather())
        }

    }


}
