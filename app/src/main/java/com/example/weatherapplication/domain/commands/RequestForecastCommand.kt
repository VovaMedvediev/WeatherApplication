package com.example.weatherapplication.domain.commands

import com.example.weatherapplication.domain.datasource.ForecastProvider
import com.example.weatherapplication.domain.model.ForecastList

class RequestForecastCommand(
        private val zipCode: Long,
        private val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<ForecastList> {

    companion object {
        const val DAYS = 7
    }

    override fun execute() = forecastProvider.requestByZipCode(zipCode, DAYS)
}