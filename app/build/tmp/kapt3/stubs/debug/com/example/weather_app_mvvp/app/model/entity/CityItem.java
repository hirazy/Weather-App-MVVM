package com.example.weather_app_mvvp.app.model.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "CITY_ITEM")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u00c5\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0010\u0010B\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u00c6\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u00ce\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020\u00062\b\u0010K\u001a\u0004\u0018\u00010LH\u00d6\u0003J\t\u0010M\u001a\u00020\u000bH\u00d6\u0001J\t\u0010N\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\b\u0005\u0010/\"\u0004\b0\u00101R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\b\u0007\u0010/\"\u0004\b!\u00101R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\b\u0012\u0010/\"\u0004\b3\u00101R&\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u001eR \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010 \"\u0004\b7\u0010\"R&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001e\u00a8\u0006O"}, d2 = {"Lcom/example/weather_app_mvvp/app/model/entity/CityItem;", "Lcom/example/weather_app_mvvp/base/OBase;", "country", "", "countryCode", "isCity", "", "isCountry", "administrative", "", "adminLevel", "", "postcode", "county", "geoloc", "Lcom/example/weather_app_mvvp/app/model/entity/Geoloc;", "importance", "objectID", "isSuburb", "localeNames", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/example/weather_app_mvvp/app/model/entity/Geoloc;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;)V", "getAdminLevel", "()Ljava/lang/Integer;", "setAdminLevel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAdministrative", "()Ljava/util/List;", "setAdministrative", "(Ljava/util/List;)V", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "getCountryCode", "setCountryCode", "getCounty", "setCounty", "getGeoloc", "()Lcom/example/weather_app_mvvp/app/model/entity/Geoloc;", "setGeoloc", "(Lcom/example/weather_app_mvvp/app/model/entity/Geoloc;)V", "getId", "setId", "getImportance", "setImportance", "()Ljava/lang/Boolean;", "setCity", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setSuburb", "getLocaleNames", "setLocaleNames", "getObjectID", "setObjectID", "getPostcode", "setPostcode", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/example/weather_app_mvvp/app/model/entity/Geoloc;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;)Lcom/example/weather_app_mvvp/app/model/entity/CityItem;", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class CityItem extends com.example.weather_app_mvvp.base.OBase {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "country")
    private java.lang.String country;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "country_code")
    private java.lang.String countryCode;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "is_city")
    private java.lang.Boolean isCity;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "is_country")
    private java.lang.Boolean isCountry;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "administrative")
    private java.util.List<java.lang.String> administrative;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "admin_level")
    private java.lang.Integer adminLevel;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "postcode")
    private java.util.List<java.lang.String> postcode;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "county")
    private java.util.List<java.lang.String> county;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "_geoloc")
    private com.example.weather_app_mvvp.app.model.entity.Geoloc geoloc;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "importance")
    private java.lang.Integer importance;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "objectID")
    private java.lang.String objectID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "is_suburb")
    private java.lang.Boolean isSuburb;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "locale_names")
    private java.util.List<java.lang.String> localeNames;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = false)
    private java.lang.Integer id;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.model.entity.CityItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCity, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCountry, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> administrative, @org.jetbrains.annotations.Nullable()
    java.lang.Integer adminLevel, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> postcode, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> county, @org.jetbrains.annotations.Nullable()
    com.example.weather_app_mvvp.app.model.entity.Geoloc geoloc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer importance, @org.jetbrains.annotations.Nullable()
    java.lang.String objectID, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSuburb, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> localeNames, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
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
    
    public CityItem() {
        super();
    }
    
    public CityItem(@org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCity, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCountry, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> administrative, @org.jetbrains.annotations.Nullable()
    java.lang.Integer adminLevel, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> postcode, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> county, @org.jetbrains.annotations.Nullable()
    com.example.weather_app_mvvp.app.model.entity.Geoloc geoloc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer importance, @org.jetbrains.annotations.Nullable()
    java.lang.String objectID, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSuburb, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> localeNames, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final void setCountry(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryCode() {
        return null;
    }
    
    public final void setCountryCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isCountry() {
        return null;
    }
    
    public final void setCountry(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getAdministrative() {
        return null;
    }
    
    public final void setAdministrative(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAdminLevel() {
        return null;
    }
    
    public final void setAdminLevel(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getPostcode() {
        return null;
    }
    
    public final void setPostcode(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getCounty() {
        return null;
    }
    
    public final void setCounty(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weather_app_mvvp.app.model.entity.Geoloc component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weather_app_mvvp.app.model.entity.Geoloc getGeoloc() {
        return null;
    }
    
    public final void setGeoloc(@org.jetbrains.annotations.Nullable()
    com.example.weather_app_mvvp.app.model.entity.Geoloc p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getImportance() {
        return null;
    }
    
    public final void setImportance(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getObjectID() {
        return null;
    }
    
    public final void setObjectID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isSuburb() {
        return null;
    }
    
    public final void setSuburb(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getLocaleNames() {
        return null;
    }
    
    public final void setLocaleNames(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}