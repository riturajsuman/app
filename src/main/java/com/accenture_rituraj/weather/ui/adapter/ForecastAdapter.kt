package com.accenture_rituraj.weather.ui.adapter

import android.annotation.SuppressLint
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.accenture_rituraj.weather.R
import com.accenture_rituraj.weather.ui.ForecastItemViewModel
import kotlinx.android.synthetic.main.forecast_list_item.view.*
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Rituraj on 7/5/2019.
 */
class ForecastAdapter() : RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder>() {

    var forecastList = mutableListOf<ForecastItemViewModel>()

    fun addForecast(list : List<ForecastItemViewModel>){
        forecastList.clear()
        forecastList.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.forecast_list_item, parent, false)
        return ForecastViewHolder(view)
    }

    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
        forecastList[position].let {
            holder.bind(forecastElement = it)
        }
    }

    override fun getItemCount(): Int {
        return forecastList.size
    }

    class ForecastViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        @SuppressLint("SetTextI18n")
        fun bind(forecastElement : ForecastItemViewModel) {
            itemView.degreeText.text = "${forecastElement.degreeDay} °C ${forecastElement.description}"
            itemView.dateText.text = getDate(forecastElement.date)
            Glide.with(itemView.context)
                    .load("http://openweathermap.org/img/w/${forecastElement.icon}.png")
                    .into(itemView.weatherIcon)
        }

        @SuppressLint("SimpleDateFormat")
        private fun  getDate(date: Long): String {
            val timeFormatter = SimpleDateFormat("dd.MM.yyyy")
            return timeFormatter.format(Date(date*1000L))
        }

    }

}