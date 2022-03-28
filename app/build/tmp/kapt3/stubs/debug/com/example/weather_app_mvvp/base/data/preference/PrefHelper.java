package com.example.weather_app_mvvp.base.data.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/example/weather_app_mvvp/base/data/preference/PrefHelper;", "", "getData", "", "key", "setData", "", "data", "app_debug"})
public abstract interface PrefHelper {
    
    public abstract void setData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getData(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
}