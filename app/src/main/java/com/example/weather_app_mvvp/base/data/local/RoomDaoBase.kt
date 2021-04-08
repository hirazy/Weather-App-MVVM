package com.example.weather_app_mvvp.base.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
@Dao
interface RoomDaoBase<T> {
    @Insert
    fun insert(t: T)

    @Update
    fun update(t: T)

    @Delete
    fun delete(t: T)
}