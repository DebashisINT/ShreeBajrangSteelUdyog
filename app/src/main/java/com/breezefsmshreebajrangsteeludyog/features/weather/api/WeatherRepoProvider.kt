package com.breezefsmshreebajrangsteeludyog.features.weather.api

import com.breezefsmshreebajrangsteeludyog.features.task.api.TaskApi
import com.breezefsmshreebajrangsteeludyog.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}