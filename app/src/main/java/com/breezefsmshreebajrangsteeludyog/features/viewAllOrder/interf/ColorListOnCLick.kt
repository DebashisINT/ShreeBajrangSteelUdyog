package com.breezefsmshreebajrangsteeludyog.features.viewAllOrder.interf

import com.breezefsmshreebajrangsteeludyog.app.domain.NewOrderGenderEntity
import com.breezefsmshreebajrangsteeludyog.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}