package com.example.weather_app_mvvp.app.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/example/weather_app_mvvp/app/ui/main/MainActivity;", "Lcom/example/weather_app_mvvp/base/ui/BaseActivity;", "Lcom/example/weather_app_mvvp/databinding/ActivityMainBinding;", "Lcom/example/weather_app_mvvp/app/ui/main/MainViewModel;", "()V", "rcvListCityAdapter", "Lcom/example/weather_app_mvvp/app/adapter/RcvListCityAdapter;", "getRcvListCityAdapter", "()Lcom/example/weather_app_mvvp/app/adapter/RcvListCityAdapter;", "setRcvListCityAdapter", "(Lcom/example/weather_app_mvvp/app/adapter/RcvListCityAdapter;)V", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getViewModel", "Ljava/lang/Class;", "initObserve", "", "initView", "app_debug"})
@com.example.weather_app_mvvp.base.utils.LayoutId(value = com.example.weather_app_mvvp.R.layout.activity_main)
public final class MainActivity extends com.example.weather_app_mvvp.base.ui.BaseActivity<com.example.weather_app_mvvp.databinding.ActivityMainBinding, com.example.weather_app_mvvp.app.ui.main.MainViewModel> {
    public com.example.weather_app_mvvp.app.adapter.RcvListCityAdapter rcvListCityAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type = "FROM_DASHBROAD";
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.adapter.RcvListCityAdapter getRcvListCityAdapter() {
        return null;
    }
    
    public final void setRcvListCityAdapter(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.adapter.RcvListCityAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void initObserve() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<com.example.weather_app_mvvp.app.ui.main.MainViewModel> getViewModel() {
        return null;
    }
}