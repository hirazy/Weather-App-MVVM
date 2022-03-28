package com.example.weather_app_mvvp.app.model.data.respository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/data/respository/LauncherRespository;", "", "()V", "cityDao", "Lcom/example/weather_app_mvvp/app/model/data/local/CityItemDbDao;", "initDao", "", "context", "Landroid/content/Context;", "isHasLocalCity", "", "app_debug"})
public final class LauncherRespository {
    private static com.example.weather_app_mvvp.app.model.data.local.CityItemDbDao cityDao;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weather_app_mvvp.app.model.data.respository.LauncherRespository INSTANCE = null;
    
    public final void initDao(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean isHasLocalCity() {
        return false;
    }
    
    private LauncherRespository() {
        super();
    }
}