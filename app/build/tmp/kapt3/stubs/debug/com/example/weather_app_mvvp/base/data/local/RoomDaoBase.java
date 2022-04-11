package com.example.weather_app_mvvp.base.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/weather_app_mvvp/base/data/local/RoomDaoBase;", "T", "", "delete", "", "t", "(Ljava/lang/Object;)V", "insert", "update", "app_debug"})
public abstract interface RoomDaoBase<T extends java.lang.Object> {
    
    @androidx.room.Insert()
    public abstract void insert(T t);
    
    @androidx.room.Update()
    public abstract void update(T t);
    
    @androidx.room.Delete()
    public abstract void delete(T t);
}