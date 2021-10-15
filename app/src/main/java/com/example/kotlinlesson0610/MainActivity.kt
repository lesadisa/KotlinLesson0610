package com.example.kotlinlesson0610

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinlesson0610.weather_screen.ui.WeatherScreenActivity


class MainActivity : AppCompatActivity() {

    private val mainPresenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val weatherButton = findViewById<Button>(R.id.weatherButton)
        weatherButton.setOnClickListener {
            Intent(this, WeatherScreenActivity::class.java).also { startActivity(it) }

        }
    }
}