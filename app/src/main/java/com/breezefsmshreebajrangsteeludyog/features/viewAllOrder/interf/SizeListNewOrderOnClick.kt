package com.breezefsmshreebajrangsteeludyog.features.viewAllOrder.interf

import com.breezefsmshreebajrangsteeludyog.app.domain.NewOrderProductEntity
import com.breezefsmshreebajrangsteeludyog.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}