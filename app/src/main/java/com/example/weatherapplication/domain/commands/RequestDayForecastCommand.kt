package com.example.weatherapplication.domain.commands

import com.example.weatherapplication.domain.datasource.ForecastProvider
import com.example.weatherapplication.domain.model.Forecast

class RequestDayForecastCommand(
        val id: Long,
        private val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<Forecast> {

    override fun execute() = forecastProvider.requestForecast(id)
}