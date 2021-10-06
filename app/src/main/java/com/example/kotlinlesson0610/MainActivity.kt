package com.example.kotlinlesson0610

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


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
    }
}