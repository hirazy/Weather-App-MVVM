package com.example.weather_app_mvvp.base.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0005B\r\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u001e\u0010\u0017\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0014\u0010\u001d\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/example/weather_app_mvvp/base/adapter/AdapterBase;", "K", "Lcom/example/weather_app_mvvp/base/OBase;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/weather_app_mvvp/base/adapter/BaseHolder;", "event", "Lcom/example/weather_app_mvvp/base/adapter/BaseViewListener;", "(Lcom/example/weather_app_mvvp/base/adapter/BaseViewListener;)V", "getEvent", "()Lcom/example/weather_app_mvvp/base/adapter/BaseViewListener;", "setEvent", "listData", "Ljava/util/ArrayList;", "getListData", "()Ljava/util/ArrayList;", "bindView", "", "itemBinding", "position", "", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "it", "", "app_debug"})
public abstract class AdapterBase<K extends com.example.weather_app_mvvp.base.OBase, T extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.weather_app_mvvp.base.adapter.BaseHolder<T>> {
    @org.jetbrains.annotations.NotNull()
    private com.example.weather_app_mvvp.base.adapter.BaseViewListener event;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<K> listData = null;
    
    public AdapterBase(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.base.adapter.BaseViewListener event) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather_app_mvvp.base.adapter.BaseViewListener getEvent() {
        return null;
    }
    
    public final void setEvent(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.base.adapter.BaseViewListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<K> getListData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.weather_app_mvvp.base.adapter.BaseHolder<T> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends K> it) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.base.adapter.BaseHolder<T> holder, int position) {
    }
    
    public abstract void bindView(@org.jetbrains.annotations.NotNull()
    com.example.weather_app_mvvp.base.adapter.BaseHolder<T> itemBinding, int position);
}