package com.example.weather_app_mvvp.app.ui.widget

import android.annotation.SuppressLint
import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import com.example.weather_app_mvvp.R
import com.example.weather_app_mvvp.app.ui.main.MainActivity

class WidgetWeather : AppWidgetProvider() {

    override fun onReceive(context: Context?, widgetIntent: Intent) {
        val action = widgetIntent.action
        super.onReceive(context, widgetIntent)
    }

    @SuppressLint("RemoteViewLayout")
    override fun onUpdate(
        context: Context?,
        appWidgetManager: AppWidgetManager?,
        appWidgetIds: IntArray?
    ) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)

        // CALL API Response

        appWidgetIds!!.forEach { appWidgetId ->
            // Create an Intent to launch ExampleActivity.
            val pendingIntent: PendingIntent = PendingIntent.getActivity(
                /* context = */ context,
                /* requestCode = */  0,
                /* intent = */ Intent(context, MainActivity::class.java),
                /* flags = */ PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )

            // Get the layout for the widget and attach an on-click listener
            // to the button.
            val views: RemoteViews = RemoteViews(
                context!!.packageName,
                R.layout.app_widget
            ).apply {
                // setOnClickPendingIntent(R.id.button, pendingIntent)
            }

            // Tell the AppWidgetManager to perform an update on the current
            // widget.
            appWidgetManager!!.updateAppWidget(appWidgetId, views)
        }


    }

    private fun updateWidget(){

    }
}