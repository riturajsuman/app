package com.accenture_rituraj.weather.dagger.module

import com.google.gson.Gson
import com.accenture_rituraj.weather.api.WorldWeatherAPI
import com.accenture_rituraj.weather.api.WorldWeatherInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Rituraj on 7/5/2019.
 */
@Module(includes = arrayOf(GSONModule::class))
class OpenWeatherAPIModule {

    @Provides @Singleton
    fun provideApi(gson : Gson): WorldWeatherAPI {

        val apiClient = OkHttpClient.Builder().addInterceptor(WorldWeatherInterceptor()).build()

        return Retrofit.Builder().apply {
            baseUrl(WorldWeatherAPI.BASE_URL)
            addConverterFactory(GsonConverterFactory.create(gson))
            client(apiClient)
        }.build().create(WorldWeatherAPI::class.java)
    }
}