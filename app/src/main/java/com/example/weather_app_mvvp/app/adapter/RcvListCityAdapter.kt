package com.example.weather_app_mvvp.app.adapter

import com.example.weather_app_mvvp.R
import com.example.weather_app_mvvp.app.model.entity.CityItem
import com.example.weather_app_mvvp.base.adapter.AdapterBase
import com.example.weather_app_mvvp.base.adapter.BaseHolder
import com.example.weather_app_mvvp.base.adapter.BaseViewListener
import com.example.weather_app_mvvp.base.utils.LayoutId
import com.example.weather_app_mvvp.databinding.ItemCityBinding

@LayoutId(R.layout.item_city)
class RcvListCityAdapter(event: BaseViewListener) : AdapterBase<CityItem, ItemCityBinding>(event) {
    override fun bindView(itemBinding: BaseHolder<ItemCityBinding>, position: Int) {
        itemBinding.itemBinding.model = listData[position]
    }
}