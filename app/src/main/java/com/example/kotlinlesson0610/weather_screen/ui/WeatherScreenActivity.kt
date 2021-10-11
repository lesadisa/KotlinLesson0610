package com.example.kotlinlesson0610.weather_screen.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.viewmodel.ext.android.viewModel

class WeatherScreenActivity() : AppCompatActivity() {
    val weatherViewModel by viewModel<WeatherScreenViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}