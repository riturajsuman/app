package com.accenture_rituraj.weather.api

import com.accenture_rituraj.weather.data.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Rituraj on 7/5/2019.
 */
interface WorldWeatherAPI {

    @GET("forecast/")
    fun dailyForecast(@Query("q") cityName : String) : Call<WeatherResponse>

    companion object {
        val BASE_URL = "http://api.openweathermap.org/data/2.5/"
    }
}