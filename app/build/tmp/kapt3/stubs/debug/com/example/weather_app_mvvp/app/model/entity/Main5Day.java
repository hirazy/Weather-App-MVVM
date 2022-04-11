package com.example.weather_app_mvvp.app.model.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\bH\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f\u00a8\u0006*"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/entity/Main5Day;", "Ljava/io/Serializable;", "temp", "", "feels_like", "temp_min", "temp_max", "pressure", "", "sea_level", "grnd_level", "humidity", "temp_kf", "(DDDDIIIID)V", "getFeels_like", "()D", "getGrnd_level", "()I", "getHumidity", "getPressure", "getSea_level", "getTemp", "getTemp_kf", "getTemp_max", "getTemp_min", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
public final class Main5Day implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "temp")
    private final double temp = 0.0;
    @com.google.gson.annotations.SerializedName(value = "feels_like")
    private final double feels_like = 0.0;
    @com.google.gson.annotations.SerializedName(value = "temp_min")
    private final double temp_min = 0.0;
    @com.google.gson.annotations.SerializedName(value = "temp_max")
    private final double temp_max = 0.0;
    @com.google.gson.annotations.SerializedName(value = "pressure")
    private final int pressure = 0;
    @com.google.gson.annotations.SerializedName(value = "sea_level")
    private final int sea_level = 0;
    @com.google.gson.annotations.SerializedName(value = "grnd_level")
    private final int grnd_level = 0;
    @com.google.gson.annotations.SerializedName(value = "humidity")
    private final int humidity = 0;
    @com.google.gson.annotations.SerializedName(value = "temp_kf")
    private final double temp_kf = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Main5Day copy(double temp, double feels_like, double temp_min, double temp_max, int pressure, int sea_level, int grnd_level, int humidity, double temp_kf) {
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
    
    public Main5Day(double temp, double feels_like, double temp_min, double temp_max, int pressure, int sea_level, int grnd_level, int humidity, double temp_kf) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double getTemp() {
        return 0.0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getFeels_like() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getTemp_min() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getTemp_max() {
        return 0.0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getPressure() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getSea_level() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getGrnd_level() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double getTemp_kf() {
        return 0.0;
    }
}