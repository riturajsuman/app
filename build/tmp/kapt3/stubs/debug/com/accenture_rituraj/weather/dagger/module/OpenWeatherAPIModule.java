package com.accenture_rituraj.weather.dagger.module;

import java.lang.System;

/**
 * Created by Rituraj on 7/5/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/accenture_rituraj/weather/dagger/module/OpenWeatherAPIModule;", "", "()V", "provideApi", "Lcom/accenture_rituraj/weather/api/WorldWeatherAPI;", "gson", "Lcom/google/gson/Gson;", "app_debug"})
@dagger.Module(includes = {com.accenture_rituraj.weather.dagger.module.GSONModule.class})
public final class OpenWeatherAPIModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.accenture_rituraj.weather.api.WorldWeatherAPI provideApi(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    public OpenWeatherAPIModule() {
        super();
    }
}