package com.breezefsmshreebajrangsteeludyog.features.viewAllOrder.interf

import com.breezefsmshreebajrangsteeludyog.app.domain.NewOrderGenderEntity
import com.breezefsmshreebajrangsteeludyog.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}