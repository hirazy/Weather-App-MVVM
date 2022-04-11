package com.example.weather_app_mvvp.base.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010 \u001a\u00020!J\u000e\u0010\u001c\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001dJ*\u0010$\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\u00042\n\u0010%\u001a\u0006\u0012\u0002\b\u00030&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020!J\u000e\u0010*\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u0011J\u0012\u0010-\u001a\u00020\"2\n\u0010.\u001a\u0006\u0012\u0002\b\u00030&R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015\u00a8\u0006/"}, d2 = {"Lcom/example/weather_app_mvvp/base/ui/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "err", "Landroidx/lifecycle/MutableLiveData;", "", "getErr", "()Landroidx/lifecycle/MutableLiveData;", "setErr", "(Landroidx/lifecycle/MutableLiveData;)V", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "loading", "", "getLoading", "setLoading", "getDataIntent", "", "", "load", "nextScreen", "clazz", "Ljava/lang/Class;", "requestCode", "", "data", "setLifecycleOwener", "showErrr", "e", "startActivityNoBack", "cls", "app_debug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading;
    public android.content.Context context;
    public android.app.Activity activity;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> err;
    public androidx.lifecycle.LifecycleOwner lifecycleOwner;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErr() {
        return null;
    }
    
    public final void setErr(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
        return null;
    }
    
    public final void setLifecycleOwner(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner p0) {
    }
    
    public final void setLifecycleOwener(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
    }
    
    public final void nextScreen(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?> clazz, int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object data) {
    }
    
    public final void startActivityNoBack(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cls) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDataIntent() {
        return null;
    }
    
    public final void loading(boolean load) {
    }
    
    public final void showErrr(@org.jetbrains.annotations.NotNull()
    java.lang.String e) {
    }
}