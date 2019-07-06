package com.accenture_rituraj.weather.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Rituraj on 7/5/2019.
 */
data class WeatherResponse (@SerializedName("city") var city : City,
                            @SerializedName("list") var forecast : List<ForecastDetail>)