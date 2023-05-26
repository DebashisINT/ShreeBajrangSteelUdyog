package com.breezefsmshreebajrangsteeludyog.features.lead.api

import com.breezefsmshreebajrangsteeludyog.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefsmshreebajrangsteeludyog.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}