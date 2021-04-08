package com.example.weather_app_mvvp.base.utils

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.weather_app_mvvp.R

@BindingAdapter("image")
fun loadImage(image: ImageView, url: String) {
    Glide.with(image)
        .load(url).placeholder(R.mipmap.ic_launcher)
        .fitCenter()
        .into(image)

}

@BindingAdapter("weatherIcon")
fun loadIcon(image: ImageView, url: String?) {

    if (url.isNullOrEmpty()) {
        return
    } else {
        val newPath = url.replace(url, "a$url")
        var realUrl = newPath + "_svg"
        var iconId =
            image.context.resources.getIdentifier(realUrl, "drawable", image.context.packageName)
        Glide.with(image).load(iconId).placeholder(R.mipmap.ic_launcher).into(image)
    }

//    Glide.with(image)
//        .load(url).placeholder(R.mipmap.ic_launcher)
//        .fitCenter()
//        .into(image)


}