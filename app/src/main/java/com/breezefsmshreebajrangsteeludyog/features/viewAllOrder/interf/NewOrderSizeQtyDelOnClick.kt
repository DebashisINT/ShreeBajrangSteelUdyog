package com.breezefsmshreebajrangsteeludyog.features.viewAllOrder.interf

import com.breezefsmshreebajrangsteeludyog.app.domain.NewOrderGenderEntity
import com.breezefsmshreebajrangsteeludyog.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}