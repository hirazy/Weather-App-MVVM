package com.example.weather_app_mvvp.app.model.data.respository

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.algolia.search.saas.AlgoliaException
import com.algolia.search.saas.CompletionHandler
import com.algolia.search.saas.places.PlacesClient
import com.algolia.search.saas.places.PlacesQuery
import com.example.weather_app_mvvp.app.model.data.local.CityItemDbDao
import com.example.weather_app_mvvp.app.model.data.local.DataBase
import com.example.weather_app_mvvp.app.model.data.network.Api
import com.example.weather_app_mvvp.app.model.data.network.RetrofitClient
import com.example.weather_app_mvvp.app.model.entity.City
import com.example.weather_app_mvvp.app.model.entity.CityItem
import com.example.weather_app_mvvp.app.model.entity.SearchResponse
import com.example.weather_app_mvvp.app.model.entity.WeatherInfo
import com.example.weather_app_mvvp.app.utils.Constants
import com.example.weather_app_mvvp.base.data.preference.PrefHelper
import com.example.weather_app_mvvp.base.data.preference.PrefHelperImpl
import com.example.weather_app_mvvp.base.data.preference.getObject
import com.google.gson.Gson
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Class as Class

object MainAcRespository {

    private lateinit var api: Api
    private lateinit var cityDao: CityItemDbDao


    init {

        if (!this::api.isInitialized) {
            api = RetrofitClient.buildService(Api::class.java)
        }
    }

    fun initCityDao(context: Context) {
        if (!this::cityDao.isInitialized) {
            var dataBase = DataBase.getInstance(context)
            cityDao = dataBase.roomCityItemDao()
        }

    }

    fun getCity(cityInput: String): MutableLiveData<SearchResponse> {
        var cityList = MutableLiveData<SearchResponse>()

        val algoliaQuery = PlacesQuery(cityInput)
            .setLanguage("en")
            .setHitsPerPage(25)
        PlacesClient(Constants.APPLICATION_ID, Constants.SEARCH_API_KEY)
            .searchAsync(algoliaQuery, object : CompletionHandler {
                override fun requestCompleted(p0: JSONObject?, p1: AlgoliaException?) {

                    cityList.value = Gson().fromJson(p0.toString(), SearchResponse::class.java)
                }
            })

        return cityList
    }

    fun saveCity(context: Context, city: CityItem) {
        var mPrefHelperImpl = PrefHelperImpl(context)
        mPrefHelperImpl.setData(Constants.CITY_SAVE, city.toJSON())
    }

    fun setOrUpdateCityToRoomDb(city: CityItem) {
        cityDao.insertOrUpdate(city)
    }

    fun getCityItem(id: Int): CityItem {
        return cityDao.getData(id)
    }

    fun getAll(): List<CityItem> {
        return cityDao.getAllData()
    }


}