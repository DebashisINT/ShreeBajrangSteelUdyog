package com.breezefsmshreebajrangsteeludyog.features.dailyPlan.model

import com.breezefsmshreebajrangsteeludyog.base.BaseResponse
import java.io.Serializable

/**
 * Created by Saikat on 03-01-2020.
 */
class AllPlanListResponseModel : BaseResponse(), Serializable {
    var plan_data: ArrayList<AllPlanListDataModel>? = null
}