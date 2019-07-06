package com.accenture_rituraj.weather.dagger.component;

import java.lang.System;

/**
 * Created by Rituraj on 7/5/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/accenture_rituraj/weather/dagger/component/OpenWeatherAPIComponent;", "", "inject", "", "presenter", "Lcom/accenture_rituraj/weather/ui/presenter/MainPresenter;", "app_debug"})
@dagger.Component(modules = {com.accenture_rituraj.weather.dagger.module.OpenWeatherAPIModule.class})
@javax.inject.Singleton()
public abstract interface OpenWeatherAPIComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.accenture_rituraj.weather.ui.presenter.MainPresenter presenter);
}