package com.example.weather_app_mvvp.app.ui.dashbroad;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u001e\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\u0006\u0010\'\u001a\u00020\u001eJ\u001a\u0010(\u001a\u00020\u001e2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030*2\u0006\u0010%\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000f\u00a8\u0006+"}, d2 = {"Lcom/example/weather_app_mvvp/app/ui/dashbroad/DashBroadViewModel;", "Lcom/example/weather_app_mvvp/base/ui/BaseViewModel;", "()V", "REQUEST_CODE_START_FOR_RESULT", "", "getREQUEST_CODE_START_FOR_RESULT", "()I", "setREQUEST_CODE_START_FOR_RESULT", "(I)V", "city", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/weather_app_mvvp/app/model/entity/CityItem;", "getCity", "()Landroidx/lifecycle/MutableLiveData;", "setCity", "(Landroidx/lifecycle/MutableLiveData;)V", "listWeatherOneDayDetail", "Ljava/util/ArrayList;", "Lcom/example/weather_app_mvvp/app/model/entity/Weather1DayDetail;", "getListWeatherOneDayDetail", "setListWeatherOneDayDetail", "weather5DayData", "Lcom/example/weather_app_mvvp/app/model/entity/Weather5DayData;", "getWeather5DayData", "setWeather5DayData", "weatherCityInfo", "Lcom/example/weather_app_mvvp/app/model/entity/WeatherInfo;", "getWeatherCityInfo", "setWeatherCityInfo", "getDataCityWeather", "", "getDataWeatherFor5Day", "isExits", "", "listData", "", "", "data", "magerWeatherData", "onSearch", "startActitvity", "cls", "Ljava/lang/Class;", "app_debug"})
public final class DashBroadViewModel extends com.example.weather_app_mvvp.base.ui.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.WeatherInfo> weatherCityInfo;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.Weather5DayData> weather5DayData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail>> listWeatherOneDayDetail;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.CityItem> city;
    private int REQUEST_CODE_START_FOR_RESULT = 1;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.WeatherInfo> getWeatherCityInfo() {
        return null;
    }
    
    public final void setWeatherCityInfo(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.WeatherInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.Weather5DayData> getWeather5DayData() {
        return null;
    }
    
    public final void setWeather5DayData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.Weather5DayData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail>> getListWeatherOneDayDetail() {
        return null;
    }
    
    public final void setListWeatherOneDayDetail(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.CityItem> getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.CityItem> p0) {
    }
    
    public final int getREQUEST_CODE_START_FOR_RESULT() {
        return 0;
    }
    
    public final void setREQUEST_CODE_START_FOR_RESULT(int p0) {
    }
    
    public final void onSearch() {
    }
    
    public final void getDataCityWeather() {
    }
    
    public final void getDataWeatherFor5Day() {
    }
    
    public final void startActitvity(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cls, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail data) {
    }
    
    private final void magerWeatherData() {
    }
    
    private final boolean isExits(java.util.List<java.lang.String> listData, java.lang.String data) {
        return false;
    }
    
    public DashBroadViewModel() {
        super();
    }
}