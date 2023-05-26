package com.breezefsmshreebajrangsteeludyog.features.location.api

import com.breezefsmshreebajrangsteeludyog.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmshreebajrangsteeludyog.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}