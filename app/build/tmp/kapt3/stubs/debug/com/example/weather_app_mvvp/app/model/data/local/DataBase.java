package com.example.weather_app_mvvp.app.model.data.local;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.weather_app_mvvp.app.model.entity.typeEntityConvert.DataConvertType.class})
@androidx.room.Database(entities = {com.example.weather_app_mvvp.app.model.entity.CityItem.class, com.example.weather_app_mvvp.app.model.entity.Weather5DayData.class, com.example.weather_app_mvvp.app.model.entity.WeatherInfo.class}, version = 3)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/data/local/DataBase;", "Landroidx/room/RoomDatabase;", "()V", "roomCityItemDao", "Lcom/example/weather_app_mvvp/app/model/data/local/CityItemDbDao;", "roomWeather5DayDao", "Lcom/example/weather_app_mvvp/app/model/data/local/WeatherDbDao;", "roomWeatherInfoDao", "Lcom/example/weather_app_mvvp/app/model/data/local/WeatherCityTodayDao;", "Companion", "app_debug"})
public abstract class DataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weather_app_mvvp.app.model.data.local.DataBase.Companion Companion = null;
    private static com.example.weather_app_mvvp.app.model.data.local.DataBase instance;
    private static final androidx.room.RoomDatabase.Callback roomCallBack = null;
    
    public DataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weather_app_mvvp.app.model.data.local.CityItemDbDao roomCityItemDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weather_app_mvvp.app.model.data.local.WeatherDbDao roomWeather5DayDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weather_app_mvvp.app.model.data.local.WeatherCityTodayDao roomWeatherInfoDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/data/local/DataBase$Companion;", "", "()V", "instance", "Lcom/example/weather_app_mvvp/app/model/data/local/DataBase;", "roomCallBack", "Landroidx/room/RoomDatabase$Callback;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        public final synchronized com.example.weather_app_mvvp.app.model.data.local.DataBase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}