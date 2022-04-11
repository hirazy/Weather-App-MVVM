package com.example.weather_app_mvvp.app.model.data.network

import com.example.weather_app_mvvp.app.model.entity.Weather5DayData
import com.example.weather_app_mvvp.app.model.entity.WeatherInfo
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("weather")
    fun getWeather(
        @Query("lat") lat: String,
        @Query("lon") long: String,
        @Query("appid") apiKey: String,
    ): Call<WeatherInfo>

    @GET("forecast")
    fun getWeather5day(
        @Query("lat") lat: String,
        @Query("lon") long: String,
        @Query("appid") apiKey: String
    ): Call<Weather5DayData>
}