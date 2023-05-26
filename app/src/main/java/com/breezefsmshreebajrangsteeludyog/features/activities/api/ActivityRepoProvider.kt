package com.breezefsmshreebajrangsteeludyog.features.activities.api

import com.breezefsmshreebajrangsteeludyog.features.member.api.TeamApi
import com.breezefsmshreebajrangsteeludyog.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}