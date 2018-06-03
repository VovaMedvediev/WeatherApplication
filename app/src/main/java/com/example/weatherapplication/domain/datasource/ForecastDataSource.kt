package com.example.weatherapplication.domain.datasource

import com.example.weatherapplication.domain.model.Forecast
import com.example.weatherapplication.domain.model.ForecastList

interface ForecastDataSource {

    fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList?

    fun requestDayForecast(id: Long): Forecast?

}