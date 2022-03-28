package com.example.weather_app_mvvp.app.model.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\'\u00a8\u0006\t"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/data/local/WeatherDbDao;", "Lcom/example/weather_app_mvvp/base/data/local/RoomDaoBase;", "Lcom/example/weather_app_mvvp/app/model/entity/Weather5DayData;", "getData", "id", "", "insertOrUpdate", "", "weather5DayData", "app_debug"})
public abstract interface WeatherDbDao extends com.example.weather_app_mvvp.base.data.local.RoomDaoBase<com.example.weather_app_mvvp.app.model.entity.Weather5DayData> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from Weather5DayData where id =:id")
    public abstract com.example.weather_app_mvvp.app.model.entity.Weather5DayData getData(int id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertOrUpdate(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Weather5DayData weather5DayData);
}