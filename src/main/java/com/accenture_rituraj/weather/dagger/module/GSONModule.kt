package com.accenture_rituraj.weather.dagger.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Rituraj on 7/5/2019.
 */
@Module
class GSONModule {
    @Provides @Singleton
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }
}