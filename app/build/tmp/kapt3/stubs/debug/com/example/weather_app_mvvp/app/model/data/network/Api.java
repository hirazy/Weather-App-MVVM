package com.example.weather_app_mvvp.app.model.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\'J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/data/network/Api;", "", "getWeather", "Lretrofit2/Call;", "Lcom/example/weather_app_mvvp/app/model/entity/WeatherInfo;", "lat", "", "long", "apiKey", "getWeather5day", "Lcom/example/weather_app_mvvp/app/model/entity/Weather5DayData;", "app_debug"})
public abstract interface Api {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather")
    public abstract retrofit2.Call<com.example.weather_app_mvvp.app.model.entity.WeatherInfo> getWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lat")
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lon")
    java.lang.String p1_1663806, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "forecast")
    public abstract retrofit2.Call<com.example.weather_app_mvvp.app.model.entity.Weather5DayData> getWeather5day(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lat")
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lon")
    java.lang.String p1_1663806, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey);
}