package com.breezefsmshreebajrangsteeludyog.features.viewAllOrder.interf

import com.breezefsmshreebajrangsteeludyog.app.domain.NewOrderColorEntity
import com.breezefsmshreebajrangsteeludyog.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}