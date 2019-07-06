package com.accenture_rituraj.weather.ui.presenter

import com.accenture_rituraj.weather.BuildConfig.OPEN_WEATHER_API_KEY
import com.accenture_rituraj.weather.ErrorTypes
import com.accenture_rituraj.weather.api.WorldWeatherAPI
import com.accenture_rituraj.weather.data.ForecastDetail
import com.accenture_rituraj.weather.data.WeatherResponse
import com.accenture_rituraj.weather.ui.ForecastItemViewModel
import com.accenture_rituraj.weather.ui.view.MainView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

/**
 * Created by Rituraj on 7/5/2019.
 */
class MainPresenter(val view : MainView) {
    @Inject
    lateinit var api : WorldWeatherAPI

    fun getForecastForSevenDays(cityName : String) {
        if (OPEN_WEATHER_API_KEY == "<OPEN_WEATHER_API_KEY_HERE>") {
            view.showErrorToast(ErrorTypes.MISSING_API_KEY)
            return
        }
        view.showSpinner()
        api.dailyForecast(cityName).enqueue(object : Callback<WeatherResponse> {

            override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                response.body()?.let {
                    createListForView(it)
                    view.hideSpinner()
                } ?: view.showErrorToast(ErrorTypes.NO_RESULT_FOUND)
            }

            override fun onFailure(call: Call<WeatherResponse>?, t: Throwable) {
                view.showErrorToast(ErrorTypes.CALL_ERROR)
                t.printStackTrace()
            }
        })
    }

    private fun  createListForView(weatherResponse: WeatherResponse) {
        val forecasts = mutableListOf<ForecastItemViewModel>()
        for (forecastDetail : ForecastDetail in weatherResponse?.forecast) {
                val dayTemp = forecastDetail?.temperature?.dayTemperature
                val forecastItem = ForecastItemViewModel(degreeDay = dayTemp.toString(),
                        date = forecastDetail?.date,
                        icon = forecastDetail?.description[0].icon,
                        description = forecastDetail?.description[0]?.description)
            forecasts.add(forecastItem)
        }
        view.updateForecast(forecasts)
    }
}