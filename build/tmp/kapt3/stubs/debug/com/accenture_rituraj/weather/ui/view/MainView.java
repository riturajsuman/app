package com.accenture_rituraj.weather.ui.view;

import java.lang.System;

/**
 * Created by muhammedsalihguler on 28.07.17.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&\u00a8\u0006\f"}, d2 = {"Lcom/accenture_rituraj/weather/ui/view/MainView;", "", "hideSpinner", "", "showErrorToast", "errorType", "Lcom/accenture_rituraj/weather/ErrorTypes;", "showSpinner", "updateForecast", "forecasts", "", "Lcom/accenture_rituraj/weather/ui/ForecastItemViewModel;", "app_debug"})
public abstract interface MainView {
    
    public abstract void showSpinner();
    
    public abstract void hideSpinner();
    
    public abstract void updateForecast(@org.jetbrains.annotations.NotNull()
    java.util.List<com.accenture_rituraj.weather.ui.ForecastItemViewModel> forecasts);
    
    public abstract void showErrorToast(@org.jetbrains.annotations.NotNull()
    com.accenture_rituraj.weather.ErrorTypes errorType);
}