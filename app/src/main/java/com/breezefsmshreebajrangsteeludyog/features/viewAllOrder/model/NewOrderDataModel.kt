package com.breezefsmshreebajrangsteeludyog.features.viewAllOrder.model

import com.breezefsmshreebajrangsteeludyog.app.domain.NewOrderColorEntity
import com.breezefsmshreebajrangsteeludyog.app.domain.NewOrderGenderEntity
import com.breezefsmshreebajrangsteeludyog.app.domain.NewOrderProductEntity
import com.breezefsmshreebajrangsteeludyog.app.domain.NewOrderSizeEntity
import com.breezefsmshreebajrangsteeludyog.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

