package com.accenture_rituraj.weather

import com.accenture_rituraj.weather.api.WorldWeatherAPI
import com.accenture_rituraj.weather.api.WorldWeatherAPI.Companion.BASE_URL
import com.accenture_rituraj.weather.data.WeatherResponse
import org.junit.Test

import org.junit.Assert.*
import retrofit2.Call

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun `find package name`() {
        assertEquals("http://api.openweathermap.org/data/2.5/", BASE_URL)
    }
}
