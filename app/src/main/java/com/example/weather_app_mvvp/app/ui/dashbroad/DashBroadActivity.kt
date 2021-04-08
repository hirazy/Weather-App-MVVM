package com.example.weather_app_mvvp.app.ui.dashbroad

import android.content.Intent
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weather_app_mvvp.R
import com.example.weather_app_mvvp.app.adapter.RcvDashbroadAdapter
import com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail
import com.example.weather_app_mvvp.app.ui.weatherDetail.WeatherDetailActivity
import com.example.weather_app_mvvp.base.OBase
import com.example.weather_app_mvvp.base.adapter.BaseViewListener
import com.example.weather_app_mvvp.base.ui.BaseActivity
import com.example.weather_app_mvvp.base.utils.LayoutId
import com.example.weather_app_mvvp.databinding.ActivityDashBroadBinding
import kotlinx.android.synthetic.main.activity_dash_broad.*

@LayoutId(R.layout.activity_dash_broad)
class DashBroadActivity : BaseActivity<ActivityDashBroadBinding, DashBroadViewModel>() {

    val REQUEST_CODE_START_FOR_RESULT = 1
    lateinit var adapter: RcvDashbroadAdapter
    override fun initObserve() {
        ViewBiding.vmodel = viewModel
    }

    override fun initView() {
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        viewModel.getDataCityWeather()
        viewModel.getDataWeatherFor5Day()

        adapter = RcvDashbroadAdapter(object : BaseViewListener {
            override fun onItemClicked(index: Int, data: OBase) {

                viewModel.startActitvity(
                    WeatherDetailActivity::class.java,
                    data as Weather1DayDetail
                )
            }

            override fun onItemLongClicked(index: Int, data: OBase) {

            }
        })
        rcvDashbroad.adapter = adapter
        var layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rcvDashbroad.layoutManager = layoutManager
        viewModel.listWeatherOneDayDetail.observe(this) {
            adapter.setData(it as List<Weather1DayDetail>)
        }


    }

    override fun getViewModel(): Class<DashBroadViewModel> {
        return DashBroadViewModel::class.java
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CODE_START_FOR_RESULT && resultCode == RESULT_OK) {

            viewModel.getDataCityWeather()
            viewModel.getDataWeatherFor5Day()
        }
    }

}