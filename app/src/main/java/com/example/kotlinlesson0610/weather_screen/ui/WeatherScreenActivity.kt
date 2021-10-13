package com.example.kotlinlesson0610.weather_screen.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.kotlinlesson0610.R
import com.example.kotlinlesson0610.domain.model.WeatherDomainModel
import org.koin.android.viewmodel.ext.android.viewModel

class WeatherScreenActivity() : AppCompatActivity() {
    val weatherViewModel by viewModel<WeatherScreenViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        weatherViewModel.lifeData.observe(this, Observer(::render)) //детальное описание экрана
        weatherViewModel.requesWeather()
    }

    private fun render(state: WeatherDomainModel) {
        findViewById<TextView>(R.id.tvTempeture).let {
            it.text = state.temperature + " температура"
        }
        findViewById<TextView>(R.id.tvminTempeture).let {
            it.text = state.temperatures + " минимальная температура"
        }
    }

}