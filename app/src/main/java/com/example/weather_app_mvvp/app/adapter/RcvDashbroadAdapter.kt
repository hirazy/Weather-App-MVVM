package com.example.weather_app_mvvp.app.adapter

import com.example.weather_app_mvvp.R
import com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail
import com.example.weather_app_mvvp.app.model.entity.WeatherDetail
import com.example.weather_app_mvvp.base.adapter.AdapterBase
import com.example.weather_app_mvvp.base.adapter.BaseHolder
import com.example.weather_app_mvvp.base.adapter.BaseViewListener
import com.example.weather_app_mvvp.base.utils.LayoutId
import com.example.weather_app_mvvp.databinding.ItemRcvDashbroadBinding

@LayoutId(R.layout.item_rcv_dashbroad)
class RcvDashbroadAdapter(event: BaseViewListener) :
    AdapterBase<Weather1DayDetail, ItemRcvDashbroadBinding>(event) {
    override fun bindView(itemBinding: BaseHolder<ItemRcvDashbroadBinding>, position: Int) {
        itemBinding.itemBinding.model = listData[position]
    }
}