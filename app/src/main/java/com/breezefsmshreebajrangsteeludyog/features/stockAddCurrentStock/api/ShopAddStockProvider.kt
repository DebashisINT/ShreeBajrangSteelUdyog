package com.breezefsmshreebajrangsteeludyog.features.stockAddCurrentStock.api

import com.breezefsmshreebajrangsteeludyog.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefsmshreebajrangsteeludyog.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}