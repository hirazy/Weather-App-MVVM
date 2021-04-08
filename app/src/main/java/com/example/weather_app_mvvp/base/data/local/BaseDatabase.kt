package com.example.weather_app_mvvp.base.data.local

import android.content.Context
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.example.weather_app_mvvp.base.utils.subscribeOnBackground

//@Database(entities = [User::class], version = 1)
abstract class BaseDatabase : RoomDatabase() {


    companion object {
        private var instance: BaseDatabase? = null

        @Synchronized
        fun getInstance(context: Context): BaseDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    BaseDatabase::class.java,
                    "USER_TABLE"

                )
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallBack)
                    .allowMainThreadQueries()
                    .build()


            }
            return instance!!
        }

        private val roomCallBack = object : Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
            }
        }
    }


}