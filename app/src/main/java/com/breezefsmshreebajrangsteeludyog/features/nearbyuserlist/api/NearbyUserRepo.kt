package com.breezefsmshreebajrangsteeludyog.features.nearbyuserlist.api

import com.breezefsmshreebajrangsteeludyog.app.Pref
import com.breezefsmshreebajrangsteeludyog.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefsmshreebajrangsteeludyog.features.newcollection.model.NewCollectionListResponseModel
import com.breezefsmshreebajrangsteeludyog.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}