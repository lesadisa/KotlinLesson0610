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
            it.text = state.tempMin + " минимальная температура"
        }
        findViewById<TextView>(R.id.textViewMax).let {
            it.text = state.tempMax + " максимальная температура"
        }
        findViewById<TextView>(R.id.textViewpress).let {
            it.text = state.pressure + " атмосферное давление"
        }
        findViewById<TextView>(R.id.textViewhudr).let {
            it.text = state.humidity + " влажность"
        }
        findViewById<TextView>(R.id.textViewfeel).let {
            it.text = state.feelsLike + " температура по ощущению"
        }
    }

}