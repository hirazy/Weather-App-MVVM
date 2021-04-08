package com.example.weather_app_mvvp.base.ui

import android.app.Activity
import android.content.Context
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weather_app_mvvp.base.utils.getData
import com.example.weather_app_mvvp.base.utils.startActivityKiss
import com.example.weather_app_mvvp.base.utils.startActivityNoBack

open class BaseViewModel : ViewModel() {

    var loading = MutableLiveData<Boolean>()
    lateinit var context: Context
    lateinit var activity: Activity
    var err = MutableLiveData<String>()
    lateinit var lifecycleOwner: LifecycleOwner

    fun setLifecycleOwener(lifecycleOwner: LifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner
    }

    fun nextScreen(context: Activity, clazz: Class<*>, requestCode: Int, data: Any) {
        context.startActivityKiss(clazz, requestCode, data)
    }

    fun startActivityNoBack(cls: Class<*>) {
        activity.startActivityNoBack(cls)
    }


    fun getDataIntent() = getData()

    fun loading(load: Boolean) {
        loading.value = load
    }

    fun showErrr(e: String) {
        err.value = e
    }

}