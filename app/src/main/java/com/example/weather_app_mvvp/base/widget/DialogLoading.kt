package com.example.weather_app_mvvp.base.widget

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import com.example.weather_app_mvvp.R

class DialogLoading(context: Context) {
    private val mDialog: Dialog?

    init {
        mDialog = Dialog(
            context
        )
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        mDialog.setContentView(R.layout.dialog_loading)
        mDialog.setCancelable(false)
        mDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    fun showLoading() {
        mDialog!!.show()
    }

    fun dismissLoading() {
        if (mDialog != null && mDialog.isShowing) {
            mDialog.dismiss()
        }
    }
}