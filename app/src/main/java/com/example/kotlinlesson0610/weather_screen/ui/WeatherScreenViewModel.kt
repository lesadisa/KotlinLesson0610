package com.example.kotlinlesson0610.weather_screen.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinlesson0610.domain.WeatherInteractor
import kotlinx.coroutines.launch

class WeatherScreenViewModel(private val iteractor: WeatherInteractor) : ViewModel() {

    val liveData: MutableLiveData<String> = MutableLiveData("")
    fun requesWeather() {
        viewModelScope.launch {
            liveData.postValue(iteractor.getWeather())
        }

    }


}