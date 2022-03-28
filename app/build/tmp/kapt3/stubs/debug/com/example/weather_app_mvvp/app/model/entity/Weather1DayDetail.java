package com.example.weather_app_mvvp.app.model.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003J\u0019\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u000bJ\t\u0010#\u001a\u00020$H\u00d6\u0001J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\'J\t\u0010)\u001a\u00020\'H\u00d6\u0001R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006*"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/entity/Weather1DayDetail;", "Lcom/example/weather_app_mvvp/base/OBase;", "Ljava/io/Serializable;", "listData", "", "Lcom/example/weather_app_mvvp/app/model/entity/WeatherDetail;", "(Ljava/util/List;)V", "getListData", "()Ljava/util/List;", "setListData", "tempMax", "", "getTempMax", "()D", "setTempMax", "(D)V", "tempMin", "getTempMin", "setTempMin", "weatherShow", "getWeatherShow", "()Lcom/example/weather_app_mvvp/app/model/entity/WeatherDetail;", "setWeatherShow", "(Lcom/example/weather_app_mvvp/app/model/entity/WeatherDetail;)V", "component1", "copy", "equals", "", "other", "", "getDateTime", "Lorg/threeten/bp/DayOfWeek;", "s", "", "getTempShow", "hashCode", "", "setColor", "setDate", "", "setTime", "toString", "app_debug"})
public final class Weather1DayDetail extends com.example.weather_app_mvvp.base.OBase implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private com.example.weather_app_mvvp.app.model.entity.WeatherDetail weatherShow;
    private double tempMin;
    private double tempMax;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.weather_app_mvvp.app.model.entity.WeatherDetail> listData;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.WeatherDetail getWeatherShow() {
        return null;
    }
    
    public final void setWeatherShow(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.WeatherDetail p0) {
    }
    
    public final double getTempMin() {
        return 0.0;
    }
    
    public final void setTempMin(double p0) {
    }
    
    public final double getTempMax() {
        return 0.0;
    }
    
    public final void setTempMax(double p0) {
    }
    
    public final double getTempShow() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String setTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String setDate() {
        return null;
    }
    
    public final int setColor() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.threeten.bp.DayOfWeek getDateTime(long s) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather_app_mvvp.app.model.entity.WeatherDetail> getListData() {
        return null;
    }
    
    public final void setListData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather_app_mvvp.app.model.entity.WeatherDetail> p0) {
    }
    
    public Weather1DayDetail(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather_app_mvvp.app.model.entity.WeatherDetail> listData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather_app_mvvp.app.model.entity.WeatherDetail> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather_app_mvvp.app.model.entity.WeatherDetail> listData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}