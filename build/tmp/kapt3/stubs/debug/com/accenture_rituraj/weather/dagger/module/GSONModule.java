package com.accenture_rituraj.weather.dagger.module;

import java.lang.System;

/**
 * Created by Rituraj on 7/5/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/accenture_rituraj/weather/dagger/module/GSONModule;", "", "()V", "provideGson", "Lcom/google/gson/Gson;", "app_debug"})
@dagger.Module()
public final class GSONModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    public GSONModule() {
        super();
    }
}