package com.example.weather_app_mvvp.app.ui.splash

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import com.example.weather_app_mvvp.R
import com.example.weather_app_mvvp.app.ui.dashbroad.DashBroadActivity
import com.example.weather_app_mvvp.base.ui.BaseActivity
import com.example.weather_app_mvvp.base.utils.LayoutId
import com.example.weather_app_mvvp.databinding.ActivitySplashBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.BlurTransformation
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.*

@LayoutId(R.layout.activity_splash)
class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>() {

    lateinit var handler: Handler


    override fun initObserve() {
        ViewBiding.vmodel = viewModel
    }

    override fun initView() {

        // setBackground()

//        Blurry.with(this).sampling(1).color(Color.argb(40, 0, 255, 255))
//            .async()
//            .capture(imgSplash).into(imgSplash)



        handler = Handler()
        handler.postDelayed({
            viewModel.startActivity(
                DashBroadActivity::class.java,
            )
        }, 3000)
    }

//    private fun setBackground() {
//        val rands = (0..1).random()
//        when (rands) {
//            0 -> {
//                imgSplash.setImageResource(R.mipmap.bg_splash)
//            }
//
//            1 -> {
//                imgSplash.setImageResource(R.mipmap.bg_splash_1)
//            }
//        }
//
//    }

    private fun setLanguage(lang: String) {
        val locale = Locale(lang)
        var resource = this.resources
        var configuration = resource.configuration
        configuration.setLocale(locale)
        resource.updateConfiguration(configuration, resource.displayMetrics)
        startActivity(Intent(this, SplashActivity::class.java))
        finish()
    }

    private fun getVersion(): String {
        return try {
            "v " + packageManager
                .getPackageInfo(packageName, 0).versionName
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
            "v 1.0.0"
        }
    }

    override fun getViewModel(): Class<SplashViewModel> {
        return SplashViewModel::class.java
    }
}