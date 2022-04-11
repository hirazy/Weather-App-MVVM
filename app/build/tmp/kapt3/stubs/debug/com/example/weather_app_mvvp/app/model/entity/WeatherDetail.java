package com.example.weather_app_mvvp.app.model.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0004H\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\t\u0010,\u001a\u00020\u000bH\u00c6\u0003J\t\u0010-\u001a\u00020\rH\u00c6\u0003J\t\u0010.\u001a\u00020\u000fH\u00c6\u0003J\t\u0010/\u001a\u00020\u0011H\u00c6\u0003J\t\u00100\u001a\u00020\u0013H\u00c6\u0003J\t\u00101\u001a\u00020\u0015H\u00c6\u0003Ji\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u00d6\u0003J\u0012\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020\u0004H\u0002J\u0006\u0010:\u001a\u00020\u0015J\u0006\u0010;\u001a\u00020\u0015J\t\u0010<\u001a\u00020\u000fH\u00d6\u0001J\u0006\u0010=\u001a\u00020\u000fJ\t\u0010>\u001a\u00020\u0015H\u00d6\u0001R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u0006?"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/entity/WeatherDetail;", "Lcom/example/weather_app_mvvp/base/OBase;", "Ljava/io/Serializable;", "dt", "", "main", "Lcom/example/weather_app_mvvp/app/model/entity/Main5Day;", "weather", "", "Lcom/example/weather_app_mvvp/app/model/entity/Weather5Day;", "clouds", "Lcom/example/weather_app_mvvp/app/model/entity/Clouds5Day;", "wind", "Lcom/example/weather_app_mvvp/app/model/entity/Wind5Day;", "visibility", "", "pop", "", "sys", "Lcom/example/weather_app_mvvp/app/model/entity/Sys5Day;", "dt_txt", "", "(JLcom/example/weather_app_mvvp/app/model/entity/Main5Day;Ljava/util/List;Lcom/example/weather_app_mvvp/app/model/entity/Clouds5Day;Lcom/example/weather_app_mvvp/app/model/entity/Wind5Day;IDLcom/example/weather_app_mvvp/app/model/entity/Sys5Day;Ljava/lang/String;)V", "getClouds", "()Lcom/example/weather_app_mvvp/app/model/entity/Clouds5Day;", "getDt", "()J", "getDt_txt", "()Ljava/lang/String;", "getMain", "()Lcom/example/weather_app_mvvp/app/model/entity/Main5Day;", "getPop", "()D", "getSys", "()Lcom/example/weather_app_mvvp/app/model/entity/Sys5Day;", "getVisibility", "()I", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/example/weather_app_mvvp/app/model/entity/Wind5Day;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "getDateTime", "Lorg/threeten/bp/DayOfWeek;", "s", "getTemp", "getTime", "hashCode", "setColor", "toString", "app_debug"})
public final class WeatherDetail extends com.example.weather_app_mvvp.base.OBase implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final long dt = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "main")
    private final com.example.weather_app_mvvp.app.model.entity.Main5Day main = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather5Day> weather = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private final com.example.weather_app_mvvp.app.model.entity.Clouds5Day clouds = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "wind")
    private final com.example.weather_app_mvvp.app.model.entity.Wind5Day wind = null;
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private final int visibility = 0;
    @com.google.gson.annotations.SerializedName(value = "pop")
    private final double pop = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "sys")
    private final com.example.weather_app_mvvp.app.model.entity.Sys5Day sys = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "dt_txt")
    private final java.lang.String dt_txt = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.WeatherDetail copy(long dt, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Main5Day main, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather5Day> weather, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Clouds5Day clouds, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Wind5Day wind, int visibility, double pop, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Sys5Day sys, @org.jetbrains.annotations.NotNull()
    java.lang.String dt_txt) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherDetail(long dt, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Main5Day main, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather5Day> weather, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Clouds5Day clouds, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Wind5Day wind, int visibility, double pop, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Sys5Day sys, @org.jetbrains.annotations.NotNull()
    java.lang.String dt_txt) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getDt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Main5Day component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Main5Day getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather5Day> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather5Day> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Clouds5Day component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Clouds5Day getClouds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Wind5Day component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Wind5Day getWind() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getPop() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Sys5Day component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Sys5Day getSys() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDt_txt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTemp() {
        return null;
    }
    
    private final org.threeten.bp.DayOfWeek getDateTime(long s) {
        return null;
    }
    
    public final int setColor() {
        return 0;
    }
}