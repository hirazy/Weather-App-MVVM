package com.example.weather_app_mvvp.app.ui.launcher

import android.content.Intent
import com.example.weather_app_mvvp.app.model.data.respository.LauncherRespository
import com.example.weather_app_mvvp.app.model.entity.CityItem
import com.example.weather_app_mvvp.app.ui.dashbroad.DashBroadActivity
import com.example.weather_app_mvvp.app.ui.main.MainActivity
import com.example.weather_app_mvvp.app.utils.Constants
import com.example.weather_app_mvvp.base.data.preference.PrefHelperImpl
import com.example.weather_app_mvvp.base.data.preference.getObject
import com.example.weather_app_mvvp.base.ui.BaseViewModel

class LauncherViewModel : BaseViewModel() {
    fun firstInit() {
//        var mPrefHelperImpl = PrefHelperImpl(context)
//        if (mPrefHelperImpl.getObject<CityItem>(Constants.CITY_SAVE) != null) {
//            startActivityNoBack(DashBroadActivity::class.java)
//        } else {
//            startActivityNoBack(MainActivity::class.java)
//        }
        LauncherRespository.initDao(context)
        LauncherRespository.isHasLocalCity()
        if (LauncherRespository.isHasLocalCity()) {
            startActivityNoBack(DashBroadActivity::class.java)
        } else {
            var intent = Intent(activity, MainActivity::class.java)
            intent.putExtra(Constants.TYPE, Constants.FROM_LAUNCHER)
            activity.startActivity(intent)
            activity.finish()
        }
    }
}