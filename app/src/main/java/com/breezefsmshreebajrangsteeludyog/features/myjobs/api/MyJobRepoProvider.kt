package com.breezefsmshreebajrangsteeludyog.features.myjobs.api

import android.content.Context
import android.net.Uri
import android.util.Log
import com.breezefsmshreebajrangsteeludyog.app.FileUtils
import com.breezefsmshreebajrangsteeludyog.base.BaseResponse
import com.breezefsmshreebajrangsteeludyog.features.activities.model.ActivityImage
import com.breezefsmshreebajrangsteeludyog.features.activities.model.AddActivityInputModel
import com.breezefsmshreebajrangsteeludyog.features.myjobs.model.WIPSubmit
import com.fasterxml.jackson.databind.ObjectMapper
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

object MyJobRepoProvider {
    fun jobRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.create())
    }

    fun jobMultipartRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.createMultiPart())
    }

}