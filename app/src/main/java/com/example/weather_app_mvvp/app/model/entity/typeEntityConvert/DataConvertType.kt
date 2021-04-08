package com.example.weather_app_mvvp.app.model.entity.typeEntityConvert

import androidx.room.TypeConverter
import com.example.weather_app_mvvp.app.model.entity.*
import com.example.weather_app_mvvp.base.utils.toArrayList
import com.example.weather_app_mvvp.base.utils.toJSON
import com.example.weather_app_mvvp.base.utils.toObject
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import java.util.*

object DataConvertType {
    var gson = Gson()

    @TypeConverter
    @JvmStatic
    fun stringToSomeObjectList(data: String?): List<String?>? {
        if (data == null) {
            return Collections.emptyList()
        }
        val listType: Type = object : TypeToken<List<String?>?>() {}.type
        return gson.fromJson<List<String?>>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun someObjectListToString(someObjects: List<String?>?): String? {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    @JvmStatic
    fun stringToSomeObject(data: String): Geoloc = data.toObject()

    @TypeConverter
    @JvmStatic
    fun someObjectToString(someObjects: Geoloc): String = someObjects.toJSON()

    @TypeConverter
    @JvmStatic
    fun stringToWeatherDetailtList(data: String): List<WeatherDetail> {
        return data.toArrayList()
    }

    @TypeConverter
    @JvmStatic
    fun someWeatherDetailListToString(someObjects: List<WeatherDetail>): String=someObjects.toJSON()

    @TypeConverter
    @JvmStatic
    fun stringToCity5Day(data: String?): City5Day? {
        if (data == null) {
            return City5Day(
                -1, "", Coord5Day(-1.0, -1.0),
                "", -1, -1, -1, -1
            )
        }
        val listType: Type = object : TypeToken<City5Day?>() {}.type
        return gson.fromJson<City5Day?>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun city5DayToString(someObjects: City5Day?): String? {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    @JvmStatic
    fun stringToMain5Day(data: String?): Main5Day? {
        if (data == null) {
            return Main5Day(
                0.0, 0.0, 0.0, 0.0,
                1, 1, 1, 1, 0.0
            )
        }
        val listType: Type = object : TypeToken<Main5Day?>() {}.type
        return gson.fromJson<Main5Day?>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun main5DayToString(someObjects: Main5Day?): String? {
        return gson.toJson(someObjects)
    }


    @TypeConverter
    @JvmStatic
    fun stringToSomeWeather5Day(data: String?): List<Weather5Day?>? {
        if (data == null) {
            return Collections.emptyList()
        }
        val listType: Type = object : TypeToken<List<Weather5Day?>?>() {}.type
        return gson.fromJson<List<Weather5Day?>>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun weather5DayListToString(someObjects: List<Weather5Day?>?): String? {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    @JvmStatic
    fun stringToClouds5Day(data: String?): Clouds5Day? {
        if (data == null) {
            return Clouds5Day(-1)
        }
        val listType: Type = object : TypeToken<Clouds5Day?>() {}.type
        return gson.fromJson<Clouds5Day?>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun clouds5DayToString(someObjects: Clouds5Day?): String? {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    @JvmStatic
    fun stringToWind5Day(data: String?): Wind5Day? {
        if (data == null) {
            return Wind5Day(1.0, 0)
        }
        val listType: Type = object : TypeToken<Wind5Day?>() {}.type
        return gson.fromJson<Wind5Day?>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun wind5DayToString(someObjects: Wind5Day?): String? {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    @JvmStatic
    fun stringToSys5Day(data: String?): Sys5Day? {
        if (data == null) {
            return Sys5Day("")
        }
        val listType: Type = object : TypeToken<Sys5Day?>() {}.type
        return gson.fromJson<Sys5Day?>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun sys5DayToString(someObjects: Sys5Day?): String? {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    @JvmStatic
    fun stringToCityCoord5Day(data: String?): Coord5Day? {
        if (data == null) {
            return Coord5Day(
                1.0, 1.0
            )
        }
        val listType: Type = object : TypeToken<Coord5Day?>() {}.type
        return gson.fromJson<Coord5Day?>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun coord5DayToString(someObjects: Coord5Day?): String? {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    @JvmStatic
    fun stringToCityCoord(data: String?): Coord? {
        if (data == null) {
            return Coord(
                1.0, 1.0
            )
        }
        val listType: Type = object : TypeToken<Coord?>() {}.type
        return gson.fromJson<Coord?>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun coordToString(someObjects: Coord?): String? {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    @JvmStatic
    fun stringToSomeWeather(data: String?): List<Weather?>? {
        if (data == null) {
            return Collections.emptyList()
        }
        val listType: Type = object : TypeToken<List<Weather?>?>() {}.type
        return gson.fromJson<List<Weather?>>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun weatherListToString(someObjects: List<Weather?>?): String? {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    @JvmStatic
    fun stringToCityMain(data: String?): Main? {
        if (data == null) {
            return Main(
                1.0, 1.0, 1.0, 1.0, 1, 1,
            )
        }
        val listType: Type = object : TypeToken<Main?>() {}.type
        return gson.fromJson<Main?>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun mainToString(someObjects: Main?): String? {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    @JvmStatic
    fun stringToCityWind(data: String?): Wind? {
        if (data == null) {
            return Wind(
                1.0, 1
            )
        }
        val listType: Type = object : TypeToken<Wind?>() {}.type
        return gson.fromJson<Wind?>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun windToString(someObjects: Wind?): String? {
        return gson.toJson(someObjects)
    }

//    Clouds

    @TypeConverter
    @JvmStatic
    fun stringToCityClouds(data: String?): Clouds? {
        if (data == null) {
            return Clouds(
                1
            )
        }
        val listType: Type = object : TypeToken<Clouds?>() {}.type
        return gson.fromJson<Clouds?>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun cloudsToString(someObjects: Clouds?): String? {
        return gson.toJson(someObjects)
    }


    @TypeConverter
    @JvmStatic
    fun stringToCitySys(data: String?): Sys? {
        if (data == null) {
            return Sys(
                1, 1, "", 1, 1
            )
        }
        val listType: Type = object : TypeToken<Sys?>() {}.type
        return gson.fromJson<Sys?>(data, listType)
    }

    @TypeConverter
    @JvmStatic
    fun sysToString(someObjects: Sys?): String? {
        return gson.toJson(someObjects)
    }
}