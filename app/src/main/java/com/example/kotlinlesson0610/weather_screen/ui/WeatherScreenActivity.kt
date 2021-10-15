package com.example.kotlinlesson0610.weather_screen.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.kotlinlesson0610.R
import com.example.kotlinlesson0610.WindScreenActivity
import com.example.kotlinlesson0610.domain.model.WeatherDomainModel
import com.example.kotlinlesson0610.feature.wind_screen.WindSreenViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class WeatherScreenActivity() : AppCompatActivity() {
    val weatherViewModel by viewModel<WeatherScreenViewModel>()
    val windScreenViewModel by viewModel<WindSreenViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        weatherViewModel.lifeData.observe(
            this,
            Observer(::renderWeather)
        ) //детальное описание экрана
        weatherViewModel.requesWeather()
        windScreenViewModel.lifeData.observe(
            this,
            Observer(::renderWind)
        ) //детальное описание экрана
        windScreenViewModel.requesWeather()
        findViewById<Button>(R.id.buttonWind).setOnClickListener {
            Intent(this, WindScreenActivity::class.java).also { startActivity(it) }

        }
    }

    private fun renderWind(stat: WeatherDomainModel) {
        findViewById<TextView>(R.id.tvTempeture).let {
            it.text = stat.speeds.toString()
        }
    }

    private fun renderWeather(state: WeatherDomainModel) {
//        findViewById<TextView>(R.id.tvTempeture).let {
        //          it.text = state.temperature + " температура"
        //       }
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