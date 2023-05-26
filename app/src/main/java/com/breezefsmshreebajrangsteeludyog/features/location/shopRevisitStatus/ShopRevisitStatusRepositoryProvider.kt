package com.breezefsmshreebajrangsteeludyog.features.location.shopRevisitStatus

import com.breezefsmshreebajrangsteeludyog.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmshreebajrangsteeludyog.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}