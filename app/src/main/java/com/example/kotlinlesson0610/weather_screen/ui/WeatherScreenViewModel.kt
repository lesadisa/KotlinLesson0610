package com.example.kotlinlesson0610.weather_screen.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinlesson0610.domain.WeatherInteractor
import com.example.kotlinlesson0610.domain.model.WeatherDomainModel
import kotlinx.coroutines.launch

class WeatherScreenViewModel(private val iteractor: WeatherInteractor) : ViewModel() {

    val lifeData: MutableLiveData<WeatherDomainModel> = MutableLiveData()
    fun requesWeather() {
        viewModelScope.launch {
            lifeData.postValue(iteractor.getWeather())
        }

    }


}