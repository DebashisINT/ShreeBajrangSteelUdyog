package com.breezefsmshreebajrangsteeludyog.features.survey.api

import com.breezefsmshreebajrangsteeludyog.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefsmshreebajrangsteeludyog.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}