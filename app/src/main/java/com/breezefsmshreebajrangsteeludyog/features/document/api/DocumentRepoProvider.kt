package com.breezefsmshreebajrangsteeludyog.features.document.api

import com.breezefsmshreebajrangsteeludyog.features.dymanicSection.api.DynamicApi
import com.breezefsmshreebajrangsteeludyog.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}