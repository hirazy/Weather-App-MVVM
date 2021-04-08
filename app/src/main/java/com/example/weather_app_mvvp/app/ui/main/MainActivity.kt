package com.example.weather_app_mvvp.app.ui.main

import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weather_app_mvvp.R
import com.example.weather_app_mvvp.app.adapter.RcvListCityAdapter
import com.example.weather_app_mvvp.app.model.entity.CityItem
import com.example.weather_app_mvvp.app.utils.Constants
import com.example.weather_app_mvvp.base.OBase
import com.example.weather_app_mvvp.base.adapter.BaseViewListener
import com.example.weather_app_mvvp.base.ui.BaseActivity
import com.example.weather_app_mvvp.base.utils.LayoutId
import com.example.weather_app_mvvp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

@LayoutId(R.layout.activity_main)
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    lateinit var rcvListCityAdapter: RcvListCityAdapter
    var type = Constants.FROM_DASHBROAD
    override fun initObserve() {
        ViewBiding.viewModel = viewModel
    }

    override fun initView() {

//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        type = intent.getStringExtra(Constants.TYPE)!!
        rcvListCityAdapter = RcvListCityAdapter(object : BaseViewListener {
            override fun onItemClicked(index: Int, data: OBase) {
                var myCity = data as CityItem
                viewModel.setCityToRoomDb(cityItem = myCity, type = type)
            }

            override fun onItemLongClicked(index: Int, data: OBase) {

            }

        })
        rcvCity.adapter = rcvListCityAdapter
        rcvCity.layoutManager = LinearLayoutManager(this)
        viewModel.cityData.observe(this) {
            rcvListCityAdapter.setData(it.cityItem)
        }
    }

    override fun getViewModel(): Class<MainViewModel> {
        return MainViewModel::class.java
    }
}