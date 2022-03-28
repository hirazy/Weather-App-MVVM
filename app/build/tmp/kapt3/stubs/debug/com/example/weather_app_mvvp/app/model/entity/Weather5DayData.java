package com.example.weather_app_mvvp.app.model.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "Weather5DayData")
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015JR\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011\u00a8\u0006)"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/entity/Weather5DayData;", "", "cod", "", "message", "", "cnt", "listDataDetail", "", "Lcom/example/weather_app_mvvp/app/model/entity/WeatherDetail;", "city", "Lcom/example/weather_app_mvvp/app/model/entity/City5Day;", "id", "(Ljava/lang/String;IILjava/util/List;Lcom/example/weather_app_mvvp/app/model/entity/City5Day;Ljava/lang/Integer;)V", "getCity", "()Lcom/example/weather_app_mvvp/app/model/entity/City5Day;", "getCnt", "()I", "getCod", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getListDataDetail", "()Ljava/util/List;", "getMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;IILjava/util/List;Lcom/example/weather_app_mvvp/app/model/entity/City5Day;Ljava/lang/Integer;)Lcom/example/weather_app_mvvp/app/model/entity/Weather5DayData;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Weather5DayData {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "cod")
    private final java.lang.String cod = null;
    @com.google.gson.annotations.SerializedName(value = "message")
    private final int message = 0;
    @com.google.gson.annotations.SerializedName(value = "cnt")
    private final int cnt = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "list")
    private final java.util.List<com.example.weather_app_mvvp.app.model.entity.WeatherDetail> listDataDetail = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "city")
    private final com.example.weather_app_mvvp.app.model.entity.City5Day city = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = false)
    private java.lang.Integer id;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCod() {
        return null;
    }
    
    public final int getMessage() {
        return 0;
    }
    
    public final int getCnt() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather_app_mvvp.app.model.entity.WeatherDetail> getListDataDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.City5Day getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public Weather5DayData(@org.jetbrains.annotations.NotNull()
    java.lang.String cod, int message, int cnt, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather_app_mvvp.app.model.entity.WeatherDetail> listDataDetail, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.City5Day city, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather_app_mvvp.app.model.entity.WeatherDetail> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.City5Day component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.Weather5DayData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String cod, int message, int cnt, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather_app_mvvp.app.model.entity.WeatherDetail> listDataDetail, @org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.model.entity.City5Day city, @org.jetbrains.annotations.Nullable()
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