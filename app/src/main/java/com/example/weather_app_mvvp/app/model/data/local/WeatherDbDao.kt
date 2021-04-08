package com.example.weather_app_mvvp.app.model.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.weather_app_mvvp.app.model.entity.CityItem
import com.example.weather_app_mvvp.app.model.entity.Weather5DayData
import com.example.weather_app_mvvp.base.data.local.RoomDaoBase

@Dao
interface WeatherDbDao : RoomDaoBase<Weather5DayData> {
    @Query("select * from Weather5DayData where id =:id")
    fun getData(id: Int): Weather5DayData

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrUpdate(weather5DayData: Weather5DayData)
}