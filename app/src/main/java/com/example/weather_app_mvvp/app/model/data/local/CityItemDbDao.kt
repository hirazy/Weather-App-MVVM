package com.example.weather_app_mvvp.app.model.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.weather_app_mvvp.app.model.entity.CityItem
import com.example.weather_app_mvvp.base.data.local.RoomDaoBase

@Dao
interface CityItemDbDao : RoomDaoBase<CityItem> {
    @Query("select * from CITY_ITEM where id =:id")
    fun getData(id: Int): CityItem

    @Query("select * from CITY_ITEM")
    fun getAllData(): List<CityItem>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrUpdate(cityItem: CityItem)
}