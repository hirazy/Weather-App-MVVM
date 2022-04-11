package com.example.weather_app_mvvp.app.ui.dashbroad;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\"\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/weather_app_mvvp/app/ui/dashbroad/DashBroadActivity;", "Lcom/example/weather_app_mvvp/base/ui/BaseActivity;", "Lcom/example/weather_app_mvvp/databinding/ActivityDashBroadBinding;", "Lcom/example/weather_app_mvvp/app/ui/dashbroad/DashBroadViewModel;", "()V", "REQUEST_CODE_START_FOR_RESULT", "", "getREQUEST_CODE_START_FOR_RESULT", "()I", "adapter", "Lcom/example/weather_app_mvvp/app/adapter/RcvDashbroadAdapter;", "getAdapter", "()Lcom/example/weather_app_mvvp/app/adapter/RcvDashbroadAdapter;", "setAdapter", "(Lcom/example/weather_app_mvvp/app/adapter/RcvDashbroadAdapter;)V", "mViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getViewModel", "Ljava/lang/Class;", "handleToolbar", "", "initObserve", "initView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "setLanguage", "lang", "", "app_debug"})
@com.example.weather_app_mvvp.base.utils.LayoutId(value = com.example.weather_app_mvvp.R.layout.activity_dash_broad)
public final class DashBroadActivity extends com.example.weather_app_mvvp.base.ui.BaseActivity<com.example.weather_app_mvvp.databinding.ActivityDashBroadBinding, com.example.weather_app_mvvp.app.ui.dashbroad.DashBroadViewModel> {
    private final int REQUEST_CODE_START_FOR_RESULT = 1;
    public com.example.weather_app_mvvp.app.adapter.RcvDashbroadAdapter adapter;
    private androidx.recyclerview.widget.RecyclerView.ViewHolder mViewHolder;
    private java.util.HashMap _$_findViewCache;
    
    public DashBroadActivity() {
        super();
    }
    
    public final int getREQUEST_CODE_START_FOR_RESULT() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.app.adapter.RcvDashbroadAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.app.adapter.RcvDashbroadAdapter p0) {
    }
    
    @java.lang.Override()
    public void initObserve() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    private final void handleToolbar() {
    }
    
    private final void setLanguage(java.lang.String lang) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<com.example.weather_app_mvvp.app.ui.dashbroad.DashBroadViewModel> getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
}