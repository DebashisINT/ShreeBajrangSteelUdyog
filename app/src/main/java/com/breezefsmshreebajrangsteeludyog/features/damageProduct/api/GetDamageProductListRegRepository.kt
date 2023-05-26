package com.breezefsmshreebajrangsteeludyog.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefsmshreebajrangsteeludyog.app.FileUtils
import com.breezefsmshreebajrangsteeludyog.base.BaseResponse
import com.breezefsmshreebajrangsteeludyog.features.NewQuotation.model.*
import com.breezefsmshreebajrangsteeludyog.features.addshop.model.AddShopRequestData
import com.breezefsmshreebajrangsteeludyog.features.addshop.model.AddShopResponse
import com.breezefsmshreebajrangsteeludyog.features.damageProduct.model.DamageProductResponseModel
import com.breezefsmshreebajrangsteeludyog.features.damageProduct.model.delBreakageReq
import com.breezefsmshreebajrangsteeludyog.features.damageProduct.model.viewAllBreakageReq
import com.breezefsmshreebajrangsteeludyog.features.login.model.userconfig.UserConfigResponseModel
import com.breezefsmshreebajrangsteeludyog.features.myjobs.model.WIPImageSubmit
import com.breezefsmshreebajrangsteeludyog.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}