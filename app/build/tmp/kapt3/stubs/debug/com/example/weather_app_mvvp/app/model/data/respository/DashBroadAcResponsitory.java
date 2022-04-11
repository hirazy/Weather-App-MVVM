package com.example.weather_app_mvvp.app.model.data.respository;

import java.lang.System;

@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010*\u001a\u00020%J\u0006\u0010+\u001a\u00020)J\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u000200J,\u00101\u001a\b\u0012\u0004\u0012\u00020-0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u00102\u001a\u0002032\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u00104\u001a\u0002032\u0006\u00105\u001a\u00020#J\u000e\u00106\u001a\u0002032\u0006\u00107\u001a\u00020-R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00068"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/data/respository/DashBroadAcResponsitory;", "", "()V", "api", "Lcom/example/weather_app_mvvp/app/model/data/network/Api;", "getApi", "()Lcom/example/weather_app_mvvp/app/model/data/network/Api;", "setApi", "(Lcom/example/weather_app_mvvp/app/model/data/network/Api;)V", "cityDao", "Lcom/example/weather_app_mvvp/app/model/data/local/CityItemDbDao;", "getCityDao", "()Lcom/example/weather_app_mvvp/app/model/data/local/CityItemDbDao;", "setCityDao", "(Lcom/example/weather_app_mvvp/app/model/data/local/CityItemDbDao;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "weather5DayDao", "Lcom/example/weather_app_mvvp/app/model/data/local/WeatherDbDao;", "getWeather5DayDao", "()Lcom/example/weather_app_mvvp/app/model/data/local/WeatherDbDao;", "setWeather5DayDao", "(Lcom/example/weather_app_mvvp/app/model/data/local/WeatherDbDao;)V", "weatherCityInforDao", "Lcom/example/weather_app_mvvp/app/model/data/local/WeatherCityTodayDao;", "getWeatherCityInforDao", "()Lcom/example/weather_app_mvvp/app/model/data/local/WeatherCityTodayDao;", "setWeatherCityInforDao", "(Lcom/example/weather_app_mvvp/app/model/data/local/WeatherCityTodayDao;)V", "getCitiWeather", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/weather_app_mvvp/app/model/entity/WeatherInfo;", "lat", "", "long", "apiKey", "getCityInShare", "Lcom/example/weather_app_mvvp/app/model/entity/CityItem;", "key", "getCityLocal", "getDataInDataBase", "Lcom/example/weather_app_mvvp/app/model/entity/Weather5DayData;", "getWeatherCityInfor", "id", "", "getWeatherFor5Day", "initDao", "", "saveWeatherCityInfor", "weather", "setDataInToDataBase", "weather5DayData", "app_debug"})
public final class DashBroadAcResponsitory {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weather_app_mvvp.app.model.data.respository.DashBroadAcResponsitory INSTANCE = null;
    public static com.example.weather_app_mvvp.app.model.data.network.Api api;
    public static com.example.weather_app_mvvp.app.model.data.local.CityItemDbDao cityDao;
    public static com.example.weather_app_mvvp.app.model.data.local.WeatherDbDao weather5DayDao;
    public static com.example.weather_app_mvvp.app.model.data.local.WeatherCityTodayDao weatherCityInforDao;
    public static android.content.Context context;
    
    private DashBroadAcResponsitory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.data.network.Api getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.data.network.Api p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.data.local.CityItemDbDao getCityDao() {
        return null;
    }
    
    public final void setCityDao(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.data.local.CityItemDbDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.data.local.WeatherDbDao getWeather5DayDao() {
        return null;
    }
    
    public final void setWeather5DayDao(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.data.local.WeatherDbDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.data.local.WeatherCityTodayDao getWeatherCityInforDao() {
        return null;
    }
    
    public final void setWeatherCityInforDao(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.data.local.WeatherCityTodayDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final void initDao(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.WeatherInfo> getCitiWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    java.lang.String p1_1663806, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void saveWeatherCityInfor(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.WeatherInfo weather) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.WeatherInfo getWeatherCityInfor(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.Weather5DayData> getWeatherFor5Day(@org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    java.lang.String p1_1663806, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.CityItem getCityInShare(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.CityItem getCityLocal() {
        return null;
    }
    
    public final void setDataInToDataBase(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Weather5DayData weather5DayData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Weather5DayData getDataInDataBase() {
        return null;
    }
}