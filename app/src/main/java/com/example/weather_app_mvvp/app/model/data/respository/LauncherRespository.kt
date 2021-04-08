package com.example.weather_app_mvvp.app.model.data.respository

import android.content.Context
import com.example.weather_app_mvvp.app.model.data.local.CityItemDbDao
import com.example.weather_app_mvvp.app.model.data.local.DataBase

object LauncherRespository {
    private lateinit var cityDao: CityItemDbDao
    fun initDao(context: Context) {
        if (!this::cityDao.isInitialized) {
            var dataBase = DataBase.getInstance(context)
            cityDao = dataBase.roomCityItemDao()
        }
    }

    fun isHasLocalCity(): Boolean {
        var city = cityDao.getData(1)
        return city != null
    }
}