package com.breezefsmshreebajrangsteeludyog.features.photoReg.present

import com.breezefsmshreebajrangsteeludyog.app.domain.ProspectEntity
import com.breezefsmshreebajrangsteeludyog.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}