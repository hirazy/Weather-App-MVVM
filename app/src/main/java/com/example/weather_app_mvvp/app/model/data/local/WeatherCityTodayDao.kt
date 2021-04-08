package com.example.weather_app_mvvp.app.model.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.weather_app_mvvp.app.model.entity.Weather5DayData
import com.example.weather_app_mvvp.app.model.entity.WeatherInfo
import com.example.weather_app_mvvp.base.data.local.RoomDaoBase

@Dao
interface WeatherCityTodayDao : RoomDaoBase<WeatherInfo> {
    @Query("select * from WeatherInfo where id =:id")
    fun getData(id: Int): WeatherInfo

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrUpdate(weather5DayData: WeatherInfo)
}