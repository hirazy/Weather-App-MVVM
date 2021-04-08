package com.example.weather_app_mvvp.app.ui.dashbroad

import android.content.Intent
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.weather_app_mvvp.app.model.data.respository.DashBroadAcResponsitory
import com.example.weather_app_mvvp.app.model.entity.CityItem
import com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail
import com.example.weather_app_mvvp.app.model.entity.Weather5DayData
import com.example.weather_app_mvvp.app.model.entity.WeatherInfo
import com.example.weather_app_mvvp.app.ui.main.MainActivity
import com.example.weather_app_mvvp.app.utils.Constants
import com.example.weather_app_mvvp.app.utils.Utils
import com.example.weather_app_mvvp.base.data.local.BaseDatabase
import com.example.weather_app_mvvp.base.ui.BaseViewModel
import okhttp3.internal.notify


class DashBroadViewModel : BaseViewModel() {

    var weatherCityInfo = MutableLiveData<WeatherInfo>()
    var weather5DayData = MutableLiveData<Weather5DayData>()
    var listWeatherOneDayDetail = MutableLiveData<ArrayList<Weather1DayDetail>>()
    var city = MutableLiveData<CityItem>()
    var REQUEST_CODE_START_FOR_RESULT = 1


    init {
        listWeatherOneDayDetail.value = ArrayList()
//        DashBroadAcResponsitory.initDbDao(context)
    }

    fun onSearch() {
        var intent = Intent(activity, MainActivity::class.java)
        intent.putExtra(Constants.TYPE, Constants.FROM_DASHBROAD)
        activity.startActivityForResult(
            intent,
            REQUEST_CODE_START_FOR_RESULT
        )
    }

    fun getDataCityWeather() {
        DashBroadAcResponsitory.initDao(context)
        city.value = DashBroadAcResponsitory.getCityLocal()

        weatherCityInfo =
            DashBroadAcResponsitory.getCitiWeather(
                lat = city.value!!.geoloc!!.lat.toString(),
                long = city.value!!.geoloc!!.lng.toString(),
                apiKey = Constants.API_KEY,
                context
            )
        weatherCityInfo.observe(this.lifecycleOwner) {
            Log.e("thanhnguyen", "getDataCityWeather: weatherCityInfo change")
            if (Utils.isNetworkAvailable(context)) {
                DashBroadAcResponsitory.saveWeatherCityInfor(weatherCityInfo.value!!)
            }
        }
    }

    fun getDataWeatherFor5Day() {
        weather5DayData = DashBroadAcResponsitory.getWeatherFor5Day(
            lat = city.value!!.geoloc!!.lat.toString(),
            long = city.value!!.geoloc!!.lng.toString(),
            apiKey = Constants.API_KEY,
            context = context
        )

        weather5DayData.observe(this.lifecycleOwner) {

            magerWeatherData()
            if (Utils.isNetworkAvailable(context)) {
                DashBroadAcResponsitory.setDataInToDataBase(weather5DayData.value!!)
            }


        }


    }

    fun startActitvity(cls: Class<*>, data: Weather1DayDetail) {
        var intent = Intent(activity, cls)
        intent.putExtra(Constants.WEATHER_ONE_DAY_DETAIL, data)
        activity.startActivity(intent)
    }

    private fun magerWeatherData() {
        var listDate = ArrayList<String>()
        listWeatherOneDayDetail.value!!.clear()
        for (item in weather5DayData.value!!.listDataDetail) {
            if (!isExits(listDate, item.dt_txt.split(" ")[0])) {
                listDate.add(item.dt_txt.split(" ")[0])
            }
        }

        listDate.forEach { item ->
            listWeatherOneDayDetail.value!!
                .add(Weather1DayDetail(weather5DayData.value!!.listDataDetail.filter {
                    it.dt_txt.contains(
                        item
                    )
                }))
        }
        listWeatherOneDayDetail.value = listWeatherOneDayDetail.value
    }

    private fun isExits(listData: List<String>, data: String): Boolean {
        return listData.contains(data)
    }
}