package com.accenture_rituraj.weather.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Rituraj on 7/5/2019.
 */
data class ForecastDetail(@SerializedName("dt") var  date: Long,
                          @SerializedName("main") var temperature : Temperature,
                          @SerializedName("weather") var description : List<WeatherDescription>,
                          @SerializedName("pressure") var pressure : Double,
                          @SerializedName("humidity") var humidity :Double)