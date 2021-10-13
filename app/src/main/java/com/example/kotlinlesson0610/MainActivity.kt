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
//        val text = mainPresenter.getTemperature()
//        val textView = findViewById<TextView>(R.id.textView)
//        textView.text = text
//
//        val list = listOf(1, 2, 3, 4, 5)
//
//        val filteredList: List<Int>? = null
//
//        Log.d("TAG", "$filteredList")
//
//        filteredList?.let { list ->
//            textView.text = list.toString()
//        }

        val weatherButton = findViewById<Button>(R.id.weatherButton)
        weatherButton.setOnClickListener {
            Intent(this, WeatherScreenActivity::class.java).also { startActivity(it) }

        }
    }
}