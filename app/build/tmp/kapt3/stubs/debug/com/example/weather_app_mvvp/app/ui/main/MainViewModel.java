package com.example.weather_app_mvvp.app.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/example/weather_app_mvvp/app/ui/main/MainViewModel;", "Lcom/example/weather_app_mvvp/base/ui/BaseViewModel;", "()V", "cityData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/weather_app_mvvp/app/model/entity/SearchResponse;", "getCityData", "()Landroidx/lifecycle/MutableLiveData;", "setCityData", "(Landroidx/lifecycle/MutableLiveData;)V", "cityInput", "", "getCityInput", "setCityInput", "getCity", "", "saveCity", "cityItem", "Lcom/example/weather_app_mvvp/app/model/entity/CityItem;", "setCityToRoomDb", "type", "app_debug"})
public final class MainViewModel extends com.example.weather_app_mvvp.base.ui.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> cityInput;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.SearchResponse> cityData;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCityInput() {
        return null;
    }
    
    public final void setCityInput(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.SearchResponse> getCityData() {
        return null;
    }
    
    public final void setCityData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.SearchResponse> p0) {
    }
    
    public final void getCity() {
    }
    
    public final void saveCity(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.CityItem cityItem) {
    }
    
    public final void setCityToRoomDb(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.CityItem cityItem, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public MainViewModel() {
        super();
    }
}