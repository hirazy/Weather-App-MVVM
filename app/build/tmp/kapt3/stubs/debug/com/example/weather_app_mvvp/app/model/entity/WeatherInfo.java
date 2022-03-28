package com.example.weather_app_mvvp.app.model.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "WeatherInfo")
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0019J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\fH\u00c6\u0003J\t\u0010:\u001a\u00020\bH\u00c6\u0003J\t\u0010;\u001a\u00020\fH\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\bH\u00c6\u0003J\t\u0010?\u001a\u00020\nH\u00c6\u0003J\t\u0010@\u001a\u00020\fH\u00c6\u0003J\t\u0010A\u001a\u00020\u000eH\u00c6\u0003J\t\u0010B\u001a\u00020\u0010H\u00c6\u0003J\t\u0010C\u001a\u00020\u0012H\u00c6\u0003J\t\u0010D\u001a\u00020\u0014H\u00c6\u0003J\u0098\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JH\u00d6\u0003J\u0012\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010M\u001a\u00020\u0012H\u0002J\u0006\u0010N\u001a\u00020\bJ\t\u0010O\u001a\u00020\fH\u00d6\u0001J\u0006\u0010P\u001a\u00020QJ\t\u0010R\u001a\u00020\bH\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0017\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001f\"\u0004\b\"\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\"\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0015\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107\u00a8\u0006S"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/entity/WeatherInfo;", "Lcom/example/weather_app_mvvp/base/OBase;", "coord", "Lcom/example/weather_app_mvvp/app/model/entity/Coord;", "weather", "", "Lcom/example/weather_app_mvvp/app/model/entity/Weather;", "base", "", "main", "Lcom/example/weather_app_mvvp/app/model/entity/Main;", "visibility", "", "wind", "Lcom/example/weather_app_mvvp/app/model/entity/Wind;", "clouds", "Lcom/example/weather_app_mvvp/app/model/entity/Clouds;", "dt", "", "sys", "Lcom/example/weather_app_mvvp/app/model/entity/Sys;", "timezone", "name", "cod", "id", "(Lcom/example/weather_app_mvvp/app/model/entity/Coord;Ljava/util/List;Ljava/lang/String;Lcom/example/weather_app_mvvp/app/model/entity/Main;ILcom/example/weather_app_mvvp/app/model/entity/Wind;Lcom/example/weather_app_mvvp/app/model/entity/Clouds;JLcom/example/weather_app_mvvp/app/model/entity/Sys;ILjava/lang/String;ILjava/lang/Integer;)V", "getBase", "()Ljava/lang/String;", "getClouds", "()Lcom/example/weather_app_mvvp/app/model/entity/Clouds;", "getCod", "()I", "colorStatus", "getColorStatus", "setColorStatus", "(I)V", "getCoord", "()Lcom/example/weather_app_mvvp/app/model/entity/Coord;", "getDt", "()J", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMain", "()Lcom/example/weather_app_mvvp/app/model/entity/Main;", "getName", "getSys", "()Lcom/example/weather_app_mvvp/app/model/entity/Sys;", "getTimezone", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/example/weather_app_mvvp/app/model/entity/Wind;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/example/weather_app_mvvp/app/model/entity/Coord;Ljava/util/List;Ljava/lang/String;Lcom/example/weather_app_mvvp/app/model/entity/Main;ILcom/example/weather_app_mvvp/app/model/entity/Wind;Lcom/example/weather_app_mvvp/app/model/entity/Clouds;JLcom/example/weather_app_mvvp/app/model/entity/Sys;ILjava/lang/String;ILjava/lang/Integer;)Lcom/example/weather_app_mvvp/app/model/entity/WeatherInfo;", "equals", "", "other", "", "getDateTime", "Lorg/threeten/bp/DayOfWeek;", "s", "getTemp", "hashCode", "setColor", "", "toString", "app_debug"})
public final class WeatherInfo extends com.example.weather_app_mvvp.base.OBase {
    private int colorStatus;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "coord")
    private final com.example.weather_app_mvvp.app.model.entity.Coord coord = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather> weather = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "base")
    private final java.lang.String base = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "main")
    private final com.example.weather_app_mvvp.app.model.entity.Main main = null;
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private final int visibility = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "wind")
    private final com.example.weather_app_mvvp.app.model.entity.Wind wind = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private final com.example.weather_app_mvvp.app.model.entity.Clouds clouds = null;
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final long dt = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "sys")
    private final com.example.weather_app_mvvp.app.model.entity.Sys sys = null;
    @com.google.gson.annotations.SerializedName(value = "timezone")
    private final int timezone = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @com.google.gson.annotations.SerializedName(value = "cod")
    private final int cod = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = false)
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.Integer id;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTemp() {
        return null;
    }
    
    public final int getColorStatus() {
        return 0;
    }
    
    public final void setColorStatus(int p0) {
    }
    
    private final org.threeten.bp.DayOfWeek getDateTime(long s) {
        return null;
    }
    
    public final void setColor() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Coord getCoord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Main getMain() {
        return null;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Clouds getClouds() {
        return null;
    }
    
    public final long getDt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Sys getSys() {
        return null;
    }
    
    public final int getTimezone() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getCod() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public WeatherInfo(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Coord coord, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather> weather, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Main main, int visibility, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Wind wind, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Clouds clouds, long dt, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Sys sys, int timezone, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int cod, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Coord component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Main component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Wind component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Clouds component7() {
        return null;
    }
    
    public final long component8() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Sys component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.WeatherInfo copy(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Coord coord, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather> weather, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Main main, int visibility, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Wind wind, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Clouds clouds, long dt, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.Sys sys, int timezone, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int cod, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
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