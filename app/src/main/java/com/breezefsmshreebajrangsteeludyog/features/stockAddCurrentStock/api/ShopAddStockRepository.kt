package com.breezefsmshreebajrangsteeludyog.features.stockAddCurrentStock.api

import com.breezefsmshreebajrangsteeludyog.base.BaseResponse
import com.breezefsmshreebajrangsteeludyog.features.location.model.ShopRevisitStatusRequest
import com.breezefsmshreebajrangsteeludyog.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefsmshreebajrangsteeludyog.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefsmshreebajrangsteeludyog.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefsmshreebajrangsteeludyog.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}