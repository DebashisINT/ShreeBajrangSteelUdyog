package com.breezefsmshreebajrangsteeludyog.features.photoReg.adapter

import com.breezefsmshreebajrangsteeludyog.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}