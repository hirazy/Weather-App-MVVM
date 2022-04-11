package com.example.weather_app_mvvp.app.ui.dashbroad

import android.content.Intent
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.ViewHolder
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
import java.util.*


@LayoutId(R.layout.activity_dash_broad)
class DashBroadActivity : BaseActivity<ActivityDashBroadBinding, DashBroadViewModel>() {

    val REQUEST_CODE_START_FOR_RESULT = 1
    lateinit var adapter: RcvDashbroadAdapter
    private var mViewHolder: ViewHolder? = null


    override fun initObserve() {
        ViewBiding.vmodel = viewModel
    }

    override fun initView() {

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

//        Picasso.get()
//            .load(R.mipmap.bg_city)
//            .transform(BlurTransformation(this, 25, 1 ))
//            .into(imgDashboard)

        rcvDashbroad.adapter = adapter
        var layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        rcvDashbroad.layoutManager = layoutManager
        viewModel.listWeatherOneDayDetail.observe(this) {
            adapter.setData(it as List<Weather1DayDetail>)
        }

    }

    private fun handleToolbar() {
        // setSupportActionBar()
    }

    private fun setLanguage(lang: String) {
        val locale = Locale(lang)
        var resource = this.resources
        var configuration = resource.configuration
        configuration.setLocale(locale)
        resource.updateConfiguration(configuration, resource.displayMetrics)
        startActivity(Intent(this, DashBroadActivity::class.java))
        finish()
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


//    private class ViewHolder internal constructor() {
//        private val mDuoDrawerLayout: DuoDrawerLayout
//        private val mDuoMenuView: DuoMenuView
//        private val mToolbar: Toolbar
//
//        init {
////            mDuoDrawerLayout = drawerLayout
////            mDuoMenuView = mDuoDrawerLayout.menuView as DuoMenuView
////            mToolbar = findViewById<View>(R.id.toolbar) as Toolbar
//        }
//    }

}