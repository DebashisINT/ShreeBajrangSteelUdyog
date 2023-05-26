package com.breezefsmshreebajrangsteeludyog.features.dashboard.presentation.api.dayStartEnd

import com.breezefsmshreebajrangsteeludyog.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefsmshreebajrangsteeludyog.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}