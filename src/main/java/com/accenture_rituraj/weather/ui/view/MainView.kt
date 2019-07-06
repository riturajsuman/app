package com.accenture_rituraj.weather.ui.view

import com.accenture_rituraj.weather.ErrorTypes
import com.accenture_rituraj.weather.ui.ForecastItemViewModel

/**
 * Created by muhammedsalihguler on 28.07.17.
 */
interface MainView {
    fun showSpinner()
    fun hideSpinner()
    fun updateForecast(forecasts: List<ForecastItemViewModel>)
    fun showErrorToast(errorType: ErrorTypes)
}