package com.breezefsmshreebajrangsteeludyog.features.weather.api

import com.breezefsmshreebajrangsteeludyog.base.BaseResponse
import com.breezefsmshreebajrangsteeludyog.features.task.api.TaskApi
import com.breezefsmshreebajrangsteeludyog.features.task.model.AddTaskInputModel
import com.breezefsmshreebajrangsteeludyog.features.weather.model.ForeCastAPIResponse
import com.breezefsmshreebajrangsteeludyog.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}