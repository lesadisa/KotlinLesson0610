package com.example.kotlinlesson0610



import androidx.lifecycle.ViewModel

class MainPresenter : ViewModel() {

    fun getTemperature(): String {
        return "32"
    }
}