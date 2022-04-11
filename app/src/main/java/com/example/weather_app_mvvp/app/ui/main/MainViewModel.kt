package com.example.weather_app_mvvp.app.ui.main

import android.app.Activity.RESULT_OK
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.example.weather_app_mvvp.app.model.data.respository.MainAcRespository
import com.example.weather_app_mvvp.app.model.entity.CityItem
import com.example.weather_app_mvvp.app.model.entity.SearchResponse
import com.example.weather_app_mvvp.app.ui.dashbroad.DashBroadActivity
import com.example.weather_app_mvvp.app.utils.Constants
import com.example.weather_app_mvvp.app.utils.Utils
import com.example.weather_app_mvvp.base.ui.BaseViewModel

class MainViewModel : BaseViewModel() {

    var cityInput = MutableLiveData<String>()
    var cityData = MutableLiveData<SearchResponse>()


    fun getCity() {
        if (Utils.isNetworkAvailable(context)) {
            MainAcRespository.getCity(cityInput = cityInput.value.toString())
                .observe(this.lifecycleOwner) {
                    cityData.value = it
                }
        } else {
            Toast.makeText(context, "Need internet", Toast.LENGTH_LONG).show()
        }
    }


    fun saveCity(cityItem: CityItem) {
        MainAcRespository.saveCity(context, cityItem)
        startActivityNoBack(DashBroadActivity::class.java)
    }

    fun setCityToRoomDb(cityItem: CityItem, type: String) {
        MainAcRespository.initCityDao(context)
        cityItem.id = 1
        MainAcRespository.setOrUpdateCityToRoomDb(cityItem)

        if (type == Constants.FROM_LAUNCHER) {
            startActivityNoBack(DashBroadActivity::class.java)
        } else {
            activity.setResult(RESULT_OK)
            activity.finish()
        }

    }


}