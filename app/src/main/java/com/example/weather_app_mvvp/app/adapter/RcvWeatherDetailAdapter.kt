package com.example.weather_app_mvvp.app.adapter

import com.example.weather_app_mvvp.R
import com.example.weather_app_mvvp.app.model.entity.WeatherDetail
import com.example.weather_app_mvvp.base.adapter.AdapterBase
import com.example.weather_app_mvvp.base.adapter.BaseHolder
import com.example.weather_app_mvvp.base.adapter.BaseViewListener
import com.example.weather_app_mvvp.base.utils.LayoutId
import com.example.weather_app_mvvp.databinding.ItemRcvWeatherDetailBinding

@LayoutId(R.layout.item_rcv_weather_detail)
class RcvWeatherDetailAdapter(event: BaseViewListener) :
    AdapterBase<WeatherDetail, ItemRcvWeatherDetailBinding>(event) {
    override fun bindView(itemBinding: BaseHolder<ItemRcvWeatherDetailBinding>, position: Int) {
        itemBinding.itemBinding.vmodel = listData[position]
    }
}