package com.accenture_rituraj.weather.ui

/**
 * Created by Rituraj on 7/5/2019.
 */
data class ForecastItemViewModel(val degreeDay : String,
                                 val icon : String = "01d",
                                 val date : Long = System.currentTimeMillis(),
                                 val description: String = "No description")