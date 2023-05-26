package com.breezefsmshreebajrangsteeludyog.features.login.model.productlistmodel

import com.breezefsmshreebajrangsteeludyog.app.domain.ModelEntity
import com.breezefsmshreebajrangsteeludyog.app.domain.ProductListEntity
import com.breezefsmshreebajrangsteeludyog.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}