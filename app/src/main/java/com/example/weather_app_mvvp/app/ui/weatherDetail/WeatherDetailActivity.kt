package com.example.weather_app_mvvp.app.ui.weatherDetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weather_app_mvvp.R
import com.example.weather_app_mvvp.app.adapter.RcvWeatherDetailAdapter
import com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail
import com.example.weather_app_mvvp.app.utils.Constants
import com.example.weather_app_mvvp.base.OBase
import com.example.weather_app_mvvp.base.adapter.BaseViewListener
import com.example.weather_app_mvvp.base.ui.BaseActivity
import com.example.weather_app_mvvp.base.utils.LayoutId
import com.example.weather_app_mvvp.databinding.ActivityWeatherDetailBinding
import kotlinx.android.synthetic.main.activity_weather_detail.*

@LayoutId(R.layout.activity_weather_detail)
class WeatherDetailActivity : BaseActivity<ActivityWeatherDetailBinding, WeatherDetailViewmodel>() {
    lateinit var adapter: RcvWeatherDetailAdapter
    lateinit var data: Weather1DayDetail
    override fun initObserve() {
        ViewBiding.vmodel = viewModel
        viewModel.setWeather1DayDetail(data = data)
    }

    override fun initView() {
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        data =
            intent.getSerializableExtra(Constants.WEATHER_ONE_DAY_DETAIL) as Weather1DayDetail

        adapter = RcvWeatherDetailAdapter(object : BaseViewListener {
            override fun onItemClicked(index: Int, data: OBase) {
            }

            override fun onItemLongClicked(index: Int, data: OBase) {
            }

        })
        var layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rcvWeatherDetail.adapter = adapter
        rcvWeatherDetail.layoutManager = layoutManager
        adapter.setData(data.listData)

    }

    override fun getViewModel(): Class<WeatherDetailViewmodel> {
        return WeatherDetailViewmodel::class.java
    }
}