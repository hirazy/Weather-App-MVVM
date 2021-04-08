package com.example.weather_app_mvvp.app.model.entity

import com.example.weather_app_mvvp.base.OBase

data class City(var name: String, var lat: Double, var lon: Double) : OBase()