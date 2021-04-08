package com.example.weather_app_mvvp.base.adapter
import com.example.weather_app_mvvp.base.OBase


interface BaseViewListener {
    fun onItemClicked(index: Int, data: OBase)
    fun onItemLongClicked(index: Int, data: OBase)
}