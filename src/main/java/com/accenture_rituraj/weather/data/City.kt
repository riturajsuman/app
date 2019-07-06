package com.accenture_rituraj.weather.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Rituraj on 7/5/2019.
 */
data class City(@SerializedName("name") var cityName : String,
                @SerializedName("country") var country : String)