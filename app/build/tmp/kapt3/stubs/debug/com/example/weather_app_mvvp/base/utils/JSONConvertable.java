package com.example.weather_app_mvvp.base.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lcom/example/weather_app_mvvp/base/utils/JSONConvertable;", "", "toJSON", "", "app_debug"})
public abstract interface JSONConvertable {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String toJSON();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static java.lang.String toJSON(@org.jetbrains.annotations.NotNull()
        com.example.weather_app_mvvp.base.utils.JSONConvertable $this) {
            return null;
        }
    }
}