package com.example.weather_app_mvvp.app.model.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.weather_app_mvvp.app.model.entity.CityItem
import com.example.weather_app_mvvp.app.model.entity.Weather5DayData
import com.example.weather_app_mvvp.app.model.entity.WeatherInfo
import com.example.weather_app_mvvp.app.model.entity.typeEntityConvert.DataConvertType


@Database(entities = [CityItem::class, Weather5DayData::class, WeatherInfo::class], version = 3)
@TypeConverters(DataConvertType::class)
abstract class DataBase : RoomDatabase() {
    //    abstract fun roomWeatherDao(): WeatherDbDao
    abstract fun roomCityItemDao(): CityItemDbDao
    abstract fun roomWeather5DayDao(): WeatherDbDao
    abstract fun roomWeatherInfoDao(): WeatherCityTodayDao


    companion object {

        private var instance: DataBase? = null

        @Synchronized
        fun getInstance(context: Context): DataBase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    DataBase::class.java,
                    "DataBase"

                )
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallBack)
                    .allowMainThreadQueries()
                    .build()


            }
            return instance!!
        }

        private val roomCallBack = object : Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
            }
        }


    }
}