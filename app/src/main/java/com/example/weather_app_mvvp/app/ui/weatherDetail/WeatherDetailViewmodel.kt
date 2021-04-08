package com.example.weather_app_mvvp.app.ui.weatherDetail

import androidx.lifecycle.MutableLiveData
import com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail
import com.example.weather_app_mvvp.base.ui.BaseViewModel

class WeatherDetailViewmodel : BaseViewModel() {
    var weather1DayDetail = MutableLiveData<Weather1DayDetail>()
    fun finish() {
        activity.finish()
    }

    fun setWeather1DayDetail(data: Weather1DayDetail) {
        this.weather1DayDetail.value = data
    }

}