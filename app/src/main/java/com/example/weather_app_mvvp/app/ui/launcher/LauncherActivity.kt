package com.example.weather_app_mvvp.app.ui.launcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.example.weather_app_mvvp.R
import com.example.weather_app_mvvp.base.ui.BaseActivity
import com.example.weather_app_mvvp.base.utils.LayoutId
import com.example.weather_app_mvvp.databinding.ActivityLauncherBinding

@LayoutId(R.layout.activity_launcher)
class LauncherActivity : BaseActivity<ActivityLauncherBinding, LauncherViewModel>() {
    override fun initObserve() {

    }

    override fun initView() {
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ViewBiding.vmode = viewModel
        viewModel.firstInit()
    }

    override fun getViewModel(): Class<LauncherViewModel> {
        return LauncherViewModel::class.java
    }

}