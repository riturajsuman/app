package com.accenture_rituraj.weather.dagger.component

import com.accenture_rituraj.weather.dagger.module.OpenWeatherAPIModule
import com.accenture_rituraj.weather.ui.presenter.MainPresenter
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Rituraj on 7/5/2019.
 */
@Singleton
@Component(modules = arrayOf(OpenWeatherAPIModule::class))
interface OpenWeatherAPIComponent {
    fun inject(presenter: MainPresenter);
}