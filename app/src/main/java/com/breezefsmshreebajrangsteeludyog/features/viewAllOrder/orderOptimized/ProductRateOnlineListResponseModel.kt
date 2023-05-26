package com.breezefsmshreebajrangsteeludyog.features.viewAllOrder.orderOptimized

import com.breezefsmshreebajrangsteeludyog.app.domain.ProductOnlineRateTempEntity
import com.breezefsmshreebajrangsteeludyog.base.BaseResponse
import com.breezefsmshreebajrangsteeludyog.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}