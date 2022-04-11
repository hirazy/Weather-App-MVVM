package com.example.weather_app_mvvp.app.model.data.respository

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.weather_app_mvvp.app.model.data.local.CityItemDbDao
import com.example.weather_app_mvvp.app.model.data.local.DataBase
import com.example.weather_app_mvvp.app.model.data.local.WeatherCityTodayDao
import com.example.weather_app_mvvp.app.model.data.local.WeatherDbDao
import com.example.weather_app_mvvp.app.model.data.network.Api
import com.example.weather_app_mvvp.app.model.data.network.RetrofitClient
import com.example.weather_app_mvvp.app.model.entity.CityItem
import com.example.weather_app_mvvp.app.model.entity.Weather5DayData
import com.example.weather_app_mvvp.app.model.entity.WeatherInfo
import com.example.weather_app_mvvp.app.utils.Utils
import com.example.weather_app_mvvp.base.data.preference.PrefHelperImpl
import com.example.weather_app_mvvp.base.data.preference.getObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@SuppressLint("StaticFieldLeak")
object DashBroadAcResponsitory {
    lateinit var api: Api
    lateinit var cityDao: CityItemDbDao
    lateinit var weather5DayDao: WeatherDbDao
    lateinit var weatherCityInforDao: WeatherCityTodayDao

    lateinit var context: Context

    init {
        if (!this::api.isInitialized) {
            api = RetrofitClient.buildService(Api::class.java)
        }
    }

    fun initDao(context: Context) {
        if (!this::cityDao.isInitialized) {
            var dataBase = DataBase.getInstance(context)
            cityDao = dataBase.roomCityItemDao()
        }
        if (!this::weather5DayDao.isInitialized) {
            var dataBase = DataBase.getInstance(context)
            weather5DayDao = dataBase.roomWeather5DayDao()
        }

        if (!this::weatherCityInforDao.isInitialized) {
            var dataBase = DataBase.getInstance(context)
            weatherCityInforDao = dataBase.roomWeatherInfoDao()
        }

    }

//    fun initDbDao(context: Context) {
//        if (!this::dbDao.isInitialized) {
//            var dataBase = DataBase.getInstance(context)
//            dbDao = dataBase.roomWeatherDao()
//        }
//    }

    fun getCitiWeather(
        lat: String,
        long: String,
        apiKey: String,
        context: Context
    ): MutableLiveData<WeatherInfo> {
        var data = MutableLiveData<WeatherInfo>()
        if (Utils.isNetworkAvailable(context)) {
            var call = api.getWeather(lat, long, apiKey)
            call.enqueue(object : Callback<WeatherInfo> {
                override fun onResponse(call: Call<WeatherInfo>, response: Response<WeatherInfo>) {
                    data.value = response.body()
                }

                override fun onFailure(call: Call<WeatherInfo>, t: Throwable) {
                    Log.e("thanhnguyen", "onFailure: ${t.message}")
                }
            })

        } else {
            data.value = getWeatherCityInfor(1)
        }

        return data
    }

    fun saveWeatherCityInfor(weather: WeatherInfo) {
        weather.id = 1
        weatherCityInforDao.insertOrUpdate(weather)
    }

    fun getWeatherCityInfor(id: Int): WeatherInfo {
        return weatherCityInforDao.getData(id)
    }

    fun getWeatherFor5Day(
        lat: String,
        long: String,
        apiKey: String,
        context: Context
    ): MutableLiveData<Weather5DayData> {
        var data = MutableLiveData<Weather5DayData>()
        if (Utils.isNetworkAvailable(context)) {
            var call = api.getWeather5day(lat = lat, long = long, apiKey)
            call.enqueue(object : Callback<Weather5DayData> {
                override fun onResponse(
                    call: Call<Weather5DayData>,
                    response: Response<Weather5DayData>
                ) {
                    data.value = response.body()
                }

                override fun onFailure(call: Call<Weather5DayData>, t: Throwable) {
                    Log.e("thanhnguyen", "onFailure: ${t.message}")
                }

            })
        } else {
            data.value = getDataInDataBase()
        }

        return data
    }

    fun getCityInShare(context: Context, key: String): CityItem {
        var pref = PrefHelperImpl(context)
        return pref.getObject<CityItem>(key) as CityItem
    }

    fun getCityLocal(): CityItem {
        return cityDao.getData(1)
    }

    fun setDataInToDataBase(weather5DayData: Weather5DayData) {
        weather5DayData.id = 1
        weather5DayDao.insertOrUpdate(weather5DayData)
    }

    fun getDataInDataBase(): Weather5DayData {
        return weather5DayDao.getData(1)
    }
}