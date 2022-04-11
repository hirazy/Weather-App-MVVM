package com.example.weather_app_mvvp.app.ui.setting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import com.example.weather_app_mvvp.R
import com.example.weather_app_mvvp.app.ui.splash.SplashViewModel
import com.example.weather_app_mvvp.base.ui.BaseActivity
import com.example.weather_app_mvvp.base.utils.LayoutId
import com.example.weather_app_mvvp.databinding.ActivitySettingBinding

@LayoutId(R.layout.activity_setting)
class SettingActivity : BaseActivity<ActivitySettingBinding, SettingViewModel>() {

    override fun initObserve() {
    }

    override fun initView() {
    }

    override fun getViewModel(): Class<SettingViewModel> {
        return SettingViewModel::class.java
    }


}