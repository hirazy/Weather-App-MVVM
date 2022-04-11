package com.example.weather_app_mvvp.app.model.data.respository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/data/respository/MainAcRespository;", "", "()V", "api", "Lcom/example/weather_app_mvvp/app/model/data/network/Api;", "cityDao", "Lcom/example/weather_app_mvvp/app/model/data/local/CityItemDbDao;", "getAll", "", "Lcom/example/weather_app_mvvp/app/model/entity/CityItem;", "getCity", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/weather_app_mvvp/app/model/entity/SearchResponse;", "cityInput", "", "getCityItem", "id", "", "initCityDao", "", "context", "Landroid/content/Context;", "saveCity", "city", "setOrUpdateCityToRoomDb", "app_debug"})
public final class MainAcRespository {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weather_app_mvvp.app.model.data.respository.MainAcRespository INSTANCE = null;
    private static com.example.weather_app_mvvp.app.model.data.network.Api api;
    private static com.example.weather_app_mvvp.app.model.data.local.CityItemDbDao cityDao;
    
    private MainAcRespository() {
        super();
    }
    
    public final void initCityDao(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.SearchResponse> getCity(@org.jetbrains.annotations.NotNull()
    java.lang.String cityInput) {
        return null;
    }
    
    public final void saveCity(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.CityItem city) {
    }
    
    public final void setOrUpdateCityToRoomDb(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.CityItem city) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.CityItem getCityItem(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather_app_mvvp.app.model.entity.CityItem> getAll() {
        return null;
    }
}