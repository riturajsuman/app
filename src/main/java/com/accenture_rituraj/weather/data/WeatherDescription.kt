package com.accenture_rituraj.weather.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Rituraj on 7/5/2019.
 */
data class WeatherDescription(@SerializedName("main") var main : String,
                              @SerializedName("description") var description: String,
                              @SerializedName("icon") var icon: String)