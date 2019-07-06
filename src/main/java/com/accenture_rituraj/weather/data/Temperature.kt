package com.accenture_rituraj.weather.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Rituraj on 7/5/2019.
 */
data class Temperature (@SerializedName("temp_min") var dayTemperature: Double,
                        @SerializedName("temp_max") var nightTemperature: Double)