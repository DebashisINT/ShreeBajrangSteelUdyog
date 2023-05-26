package com.breezefsmshreebajrangsteeludyog.features.stockCompetetorStock.api

import com.breezefsmshreebajrangsteeludyog.base.BaseResponse
import com.breezefsmshreebajrangsteeludyog.features.orderList.model.NewOrderListResponseModel
import com.breezefsmshreebajrangsteeludyog.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefsmshreebajrangsteeludyog.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}