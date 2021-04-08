package com.example.weather_app_mvvp.base.utils

import android.app.Activity
import android.app.Activity.RESULT_OK
import android.content.Context
import android.content.Intent

var DATA: Any = ""
fun Activity.startActivityKiss(clazz: Class<*>, requestCode: Int, data: Any) {
    DATA = data
    startActivityForResult(Intent(this, clazz), requestCode)
}

fun Activity.startActivity(clazz: Class<*>, requestCode: Int) {
    startActivityForResult(Intent(this, clazz), requestCode)
}

fun Activity.startActivityNoBack(clazz: Class<*>, requestCode: Int) {
    startActivityForResult(Intent(this, clazz), requestCode)
    finish()
}

fun Activity.startActivityNoBack(clazz: Class<*>) {
    startActivity(Intent(this, clazz))
    finish()
}

fun Activity.startActivityNoBack(clazz: Class<*>, requestCode: Int, data: Any) {
    DATA = data
    startActivityForResult(Intent(this, clazz), requestCode)
    finish()
}

fun getData(): Any = DATA

fun Activity.goBack(data: Any) {
    DATA = data
    setResult(RESULT_OK);
    finish()

}

fun Activity.goBack() {
    finish()
}