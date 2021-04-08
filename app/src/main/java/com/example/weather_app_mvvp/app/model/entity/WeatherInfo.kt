package com.example.weather_app_mvvp.app.model.entity

import android.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.weather_app_mvvp.base.OBase
import com.google.gson.annotations.SerializedName
import org.threeten.bp.DayOfWeek
import org.threeten.bp.LocalDate
import java.text.SimpleDateFormat

import java.util.*


@Entity(tableName = "WeatherInfo")
data class WeatherInfo(

    @SerializedName("coord") val coord: Coord,
    @SerializedName("weather") val weather: List<Weather>,
    @SerializedName("base") val base: String,
    @SerializedName("main") val main: Main,
    @SerializedName("visibility") val visibility: Int,
    @SerializedName("wind") val wind: Wind,
    @SerializedName("clouds") val clouds: Clouds,
    @SerializedName("dt") val dt: Long,
    @SerializedName("sys") val sys: Sys,
    @SerializedName("timezone") val timezone: Int,
    @SerializedName("name") val name: String,
    @SerializedName("cod") val cod: Int,
    @SerializedName("id")
    @PrimaryKey(autoGenerate = false) var id: Int? = null,
) : OBase() {
    fun getTemp():String{
        return String.format("%.0f", main.temp - 273.15)
    }

    var colorStatus: Int = Color.parseColor("#FF0090")


    private fun getDateTime(s: Long): DayOfWeek? {
        return try {
            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.US)
            val netDate = Date(s * 1000)
            val formattedDate = sdf.format(netDate)

            LocalDate.of(
                formattedDate.substringAfterLast("/").toInt(),
                formattedDate.substringAfter("/").take(2).toInt(),
                formattedDate.substringBefore("/").toInt()
            )
                .dayOfWeek
        } catch (e: Exception) {
            e.printStackTrace()
            DayOfWeek.MONDAY
        }
    }

    fun setColor() {
        when (dt?.let { getDateTime(it) }) {
            DayOfWeek.MONDAY -> colorStatus = Color.parseColor("#28E0AE")
            DayOfWeek.TUESDAY -> colorStatus = Color.parseColor("#FF0090")
            DayOfWeek.WEDNESDAY -> colorStatus = Color.parseColor("#FFAE00")
            DayOfWeek.THURSDAY -> colorStatus = Color.parseColor("#0090FF")
            DayOfWeek.FRIDAY -> colorStatus = Color.parseColor("#DC0000")
            DayOfWeek.SATURDAY -> colorStatus = Color.parseColor("#0051FF")
            DayOfWeek.SUNDAY -> colorStatus = Color.parseColor("#3D28E0")
            else -> colorStatus = Color.parseColor("#28E0AE")
        }
    }

}


data class Clouds(

    @SerializedName("all") val all: Int
)

data class Coord(

    @SerializedName("lon") val lon: Double,
    @SerializedName("lat") val lat: Double
)

data class Main(

    @SerializedName("temp") val temp: Double,
    @SerializedName("feels_like") val feels_like: Double,
    @SerializedName("temp_min") val temp_min: Double,
    @SerializedName("temp_max") val temp_max: Double,
    @SerializedName("pressure") val pressure: Int,
    @SerializedName("humidity") val humidity: Int
)

data class Sys(

    @SerializedName("type") val type: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("country") val country: String,
    @SerializedName("sunrise") val sunrise: Int,
    @SerializedName("sunset") val sunset: Int
)

data class Weather(

    @SerializedName("id") val id: Int,
    @SerializedName("main") val main: String,
    @SerializedName("description") val description: String,
    @SerializedName("icon") val icon: String? = "a01d"
)

data class Wind(

    @SerializedName("speed") val speed: Double,
    @SerializedName("deg") val deg: Int
)