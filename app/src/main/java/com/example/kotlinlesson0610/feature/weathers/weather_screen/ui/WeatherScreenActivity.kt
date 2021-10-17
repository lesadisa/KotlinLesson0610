package com.example.kotlinlesson0610.feature.weathers.weather_screen.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.kotlinlesson0610.R
import com.example.kotlinlesson0610.feature.weathers.domain.model.WeatherDomainModel
import com.example.kotlinlesson0610.feature.winds.ui.WindScreenActivity
import org.koin.android.viewmodel.ext.android.viewModel

class WeatherScreenActivity() : AppCompatActivity() {
    val weatherViewModel by viewModel<WeatherScreenViewModel>()

    //   private val binding: ActivityWeatherBinding by viewBinding(ActivityWeatherBinding::bind)
    var city: String = "Moscow"
    var speed: Double = 0.0
    var degree: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        weatherViewModel.lifeData.observe(
            this,
            Observer(::renderWeather)
        ) //детальное описание экрана
        weatherViewModel.requesWeather()
        findViewById<Button>(R.id.buttonWind).setOnClickListener {
            Intent(this, WindScreenActivity::class.java).also {
                intent.putExtra("speed", speed)
                intent.putExtra("degree", degree)

                startActivity(it)
            }

        }
    }


    private fun renderWeather(state: WeatherDomainModel) {
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
        speed = state.windDomainModel.speed
        degree = state.windDomainModel.degree

    }

}