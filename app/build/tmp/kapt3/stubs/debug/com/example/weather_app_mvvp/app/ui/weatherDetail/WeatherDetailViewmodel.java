package com.example.weather_app_mvvp.app.ui.weatherDetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/example/weather_app_mvvp/app/ui/weatherDetail/WeatherDetailViewmodel;", "Lcom/example/weather_app_mvvp/base/ui/BaseViewModel;", "()V", "weather1DayDetail", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/weather_app_mvvp/app/model/entity/Weather1DayDetail;", "getWeather1DayDetail", "()Landroidx/lifecycle/MutableLiveData;", "setWeather1DayDetail", "(Landroidx/lifecycle/MutableLiveData;)V", "finish", "", "data", "app_debug"})
public final class WeatherDetailViewmodel extends com.example.weather_app_mvvp.base.ui.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail> weather1DayDetail;
    
    public WeatherDetailViewmodel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail> getWeather1DayDetail() {
        return null;
    }
    
    public final void setWeather1DayDetail(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail> p0) {
    }
    
    public final void finish() {
    }
    
    public final void setWeather1DayDetail(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail data) {
    }
}