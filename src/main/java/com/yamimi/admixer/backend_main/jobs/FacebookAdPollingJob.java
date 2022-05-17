package com.yamimi.admixer.backend_main.jobs;

import com.facebook.ads.sdk.Campaign;
import com.yamimi.admixer.backend_main.daos.FacebookCampaignDAO;
import com.yamimi.admixer.backend_main.external.FacebookAdPoller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FacebookAdPollingJob extends AdPollingJob<Campaign, FacebookAdPoller, FacebookCampaignDAO> {

    @Autowired
    public FacebookAdPollingJob(FacebookAdPoller adPoller, FacebookCampaignDAO campaignDao) {
        super(campaignDao, adPoller);
    }
}
