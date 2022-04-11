package com.example.weather_app_mvvp.app.ui.splash

import android.content.Intent
import com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail
import com.example.weather_app_mvvp.app.utils.Constants
import com.example.weather_app_mvvp.base.ui.BaseViewModel


class SplashViewModel: BaseViewModel(){

    fun startActivity(cls: Class<*>) {
        var intent = Intent(activity, cls)
        // intent.putExtra(Constants.WEATHER_ONE_DAY_DETAIL, data)
        activity.startActivity(intent)
    }
}