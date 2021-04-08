package com.example.weather_app_mvvp.base.data.preference

import android.content.Context
import android.content.SharedPreferences
import com.example.weather_app_mvvp.R


class PrefHelperImpl constructor(var context: Context) :
    PrefHelper {
    private val mPrefs: SharedPreferences =
        context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE)

    private val editor = mPrefs.edit()

    override fun setData(key: String, s: String) {
        editor.putString(key, s)
        editor.commit()
    }

    override fun getData(key: String): String =
        mPrefs
            .getString(key, "").toString();


}

