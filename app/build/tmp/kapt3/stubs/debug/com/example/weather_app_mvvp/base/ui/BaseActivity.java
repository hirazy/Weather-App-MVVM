package com.example.weather_app_mvvp.base.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u001eH&J\u0012\u0010 \u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014R\u001c\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0001\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u00028\u0001X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006#"}, d2 = {"Lcom/example/weather_app_mvvp/base/ui/BaseActivity;", "ViewBiding", "Landroidx/databinding/ViewDataBinding;", "viewModel", "Lcom/example/weather_app_mvvp/base/ui/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "getViewBiding", "()Landroidx/databinding/ViewDataBinding;", "setViewBiding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "loading", "Lcom/example/weather_app_mvvp/base/widget/DialogLoading;", "getLoading", "()Lcom/example/weather_app_mvvp/base/widget/DialogLoading;", "setLoading", "(Lcom/example/weather_app_mvvp/base/widget/DialogLoading;)V", "getViewModel", "()Lcom/example/weather_app_mvvp/base/ui/BaseViewModel;", "setViewModel", "(Lcom/example/weather_app_mvvp/base/ui/BaseViewModel;)V", "Lcom/example/weather_app_mvvp/base/ui/BaseViewModel;", "Ljava/lang/Class;", "initObserve", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseActivity<ViewBiding extends androidx.databinding.ViewDataBinding, viewModel extends com.example.weather_app_mvvp.base.ui.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity {
    public ViewBiding ViewBiding;
    public viewModel viewModel;
    private final java.lang.String TAG = null;
    public com.example.weather_app_mvvp.base.widget.DialogLoading loading;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final ViewBiding getViewBiding() {
        return null;
    }
    
    public final void setViewBiding(@org.jetbrains.annotations.NotNull()
    ViewBiding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final viewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    viewModel p0) {
    }
    
    protected final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.base.widget.DialogLoading getLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.base.widget.DialogLoading p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void initObserve();
    
    public abstract void initView();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Class<viewModel> getViewModel();
    
    public BaseActivity() {
        super();
    }
}