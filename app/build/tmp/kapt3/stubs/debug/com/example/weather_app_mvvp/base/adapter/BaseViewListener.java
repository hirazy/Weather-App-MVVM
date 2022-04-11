package com.example.weather_app_mvvp.base.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/example/weather_app_mvvp/base/adapter/BaseViewListener;", "", "onItemClicked", "", "index", "", "data", "Lcom/example/weather_app_mvvp/base/OBase;", "onItemLongClicked", "app_debug"})
public abstract interface BaseViewListener {
    
    public abstract void onItemClicked(int index, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.base.OBase data);
    
    public abstract void onItemLongClicked(int index, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.base.OBase data);
}